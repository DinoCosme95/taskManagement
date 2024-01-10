package com.example.taskManage.controller;


import com.example.taskManage.model.Task;
import com.example.taskManage.service.TaskService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tasks")
public class TaskUIController {



    @Autowired
    private TaskService taskService;

    @GetMapping("/list")
    public String showTaskList(HttpServletRequest request,Model model){

        Iterable<Task> tasks = taskService.fetchTaskList();
        model.addAttribute("task", tasks);
        return "taskList";

    }
    @GetMapping("/createTask")
    public String newTask(Model theModel){

        Task task = new Task();
        theModel.addAttribute("task", task);
        return "home-page";
    }
    @PostMapping("/submitForm")
    public String createTask(@ModelAttribute("task") Task task, BindingResult result){

        if (result.hasErrors()){
            return "task-confirmation";
        }
        return "redirect:/success";
    }




    @GetMapping("/homepage")
    public String homepage(){

        return "home-page";
    }
}
