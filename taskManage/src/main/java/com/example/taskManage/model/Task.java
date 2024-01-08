package com.example.taskManage.model;

import lombok.*;
import jakarta.persistence.*;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "task")
@Setter
@Getter
public class Task {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskName;

    private String description;

    private LocalDateTime dateCreated;

    private LocalDateTime deadline;

    private boolean status;

    private String formattedCreatedTime;



    public String getFormattedCreatedTime() {
        if (dateCreated != null) {
            return dateCreated.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        }
        return null;
    }



}
