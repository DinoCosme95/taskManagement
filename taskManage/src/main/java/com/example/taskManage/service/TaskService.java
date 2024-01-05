package com.example.taskManage.service;


import com.example.taskManage.model.Task;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface TaskService {

    Task saveTask(Task task);

    List<Task> fetchTaskList();

    Task updateTask(Task task, Long taskId);

    void deleteTaskById(Long taskId);
}
