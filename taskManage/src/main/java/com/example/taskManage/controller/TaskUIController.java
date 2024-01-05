package com.example.taskManage.controller;


import com.example.taskManage.model.Task;
import com.example.taskManage.service.TaskService;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
=======
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
>>>>>>> 76f4875 (Initial commit)
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tasks")
public class TaskUIController {



    @Autowired
    private TaskService taskService;

    @GetMapping("/list")
<<<<<<< HEAD
    public String showTaskList(Model model){
=======
    public String showTaskList(HttpServletRequest request,Model model){
>>>>>>> 76f4875 (Initial commit)

        Iterable<Task> tasks = taskService.fetchTaskList();
        model.addAttribute("tasks", tasks);
        return "taskList";

    }
<<<<<<< HEAD
=======
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
>>>>>>> 76f4875 (Initial commit)
}
