package com.example.taskManage;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.net.InetAddress;


@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.taskManage")
public class TaskManageApplication {

    private static final Logger logger = LoggerFactory.getLogger(TaskManageApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TaskManageApplication.class, args);


    }
}

