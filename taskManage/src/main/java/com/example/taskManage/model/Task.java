package com.example.taskManage.model;

import lombok.*;
import jakarta.persistence.*;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Entity
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





}
