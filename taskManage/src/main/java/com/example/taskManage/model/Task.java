package com.example.taskManage.model;

import lombok.AllArgsConstructor;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskName;

    private String description;

    private LocalDateTime dateCreated;

    private LocalDateTime deadline;

    private boolean status;

<<<<<<< HEAD
    private String formattedCreatedTime;
=======
>>>>>>> 76f4875 (Initial commit)


    public String getFormattedCreatedTime() {
        if (dateCreated != null) {
            return dateCreated.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        }
        return null;
    }

<<<<<<< HEAD
=======
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated = LocalDateTime.now();
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
>>>>>>> 76f4875 (Initial commit)

}
