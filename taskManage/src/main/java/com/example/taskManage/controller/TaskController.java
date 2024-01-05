package com.example.taskManage.controller;

import com.example.taskManage.model.Task;
import com.example.taskManage.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/controller")
public class TaskController {



    private List<Task> taskList = new ArrayList<>();

    @Autowired
    private final TaskService taskService;



    @PostMapping("/tasks")
    public Task saveTask(@Validated @RequestBody Task task){

        return taskService.saveTask(task);

    }


    @GetMapping("/tasks")
    public List<Task> fetchTaskList(){
        return taskService.fetchTaskList();
    }

    @PutMapping("/tasks/{id}")
    public Task updateTask(@RequestBody Task task,
                           @PathVariable("id") Long taskId){
        return taskService.updateTask(task, taskId);
    }

    @DeleteMapping("/tasks/{id}")
    public String deleteTaskById(@PathVariable("id") Long taskId){
        taskService.deleteTaskById(taskId);

        return "Deleted task successfully";
    }

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

}
