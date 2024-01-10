package com.example.taskManage;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.taskManage")
public class TaskManageApplication {


    public static void main(String[] args) {
        SpringApplication.run(TaskManageApplication.class, args);


    }
}

