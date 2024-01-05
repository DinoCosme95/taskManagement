package com.example.taskManage.service;

import com.example.taskManage.model.Task;
import com.example.taskManage.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class  TaskServiveImpl implements TaskService {


    @Autowired
    private TaskRepository taskRepository;




    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> fetchTaskList() {
        return (List<Task>) taskRepository.findAll();
    }

    @Override
    public Task updateTask(Task task, Long taskId) {

        Task taskDB = taskRepository.findById(taskId).get();


        if (Objects.nonNull(task.getTaskName())
                && !"".equalsIgnoreCase(
                task.getTaskName())) {
           taskDB.setTaskName(
                    task.getTaskName());
        }



        return taskRepository.save(taskDB);
    }

    @Override
    public void deleteTaskById(Long taskId) {


        taskRepository.deleteById(taskId);
    }
}
