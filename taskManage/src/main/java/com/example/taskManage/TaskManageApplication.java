package com.example.taskManage;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

<<<<<<< HEAD
=======
import java.net.InetAddress;

>>>>>>> 76f4875 (Initial commit)

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.taskManage")
public class TaskManageApplication {

	private static final Logger logger = LoggerFactory.getLogger(TaskManageApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(TaskManageApplication.class, args);


<<<<<<< HEAD
	}


	/*@Bean
	public CommandLineRunner commandLineRunner(TaskRepository taskRepository){

		return runner ->{
			createTask(taskRepository);
			//readTask(taskDAO);
			//queryForTasks(taskDAO);
			
			//queryForTasksName(taskDAO);

			//updateTask(taskDAO);

			//deleteTask(taskDAO);

			//deleteAllTasks(taskDAO);
		};
	}

	private void deleteAllTasks(TaskRepository taskRepository) {

		System.out.println("Deleting all tasks");
		 taskRepository.deleteAll();
		System.out.println("All Task deleted");

	}

	private void deleteTask(TaskRepository taskDAO) {

		long taskID = 3L;

		System.out.println("Deleting task id: "+ taskID);
		taskDAO.deleteById(taskID);
	}

	private void updateTask(TaskRepository taskRepository) {
		//retrieve task based on the id: primary key
		long taskId = 1L;
		System.out.println("Getting the task id: "+taskId);

		Optional<Task> optionalTask = taskRepository.findById(taskId);

		if (optionalTask.isPresent()) {
			Task myTask = optionalTask.get();

			// change the task name
			System.out.println("Updating task");
			myTask.setTaskName("Updating");


			//update the task
			taskRepository.save(myTask);
			// display the task
			System.out.println("Updated task: " + myTask);
		}else {
			System.out.println("Task with ID" + taskId + " not found");
		}
	}

	private void queryForTasksName(TaskRepository taskRepository) {
		//get list of tasks
		List<Task> taskList = taskRepository.findByTaskName("Debug");
		//display task of students
		for (Task tempTask: taskList){
			System.out.println(tempTask);
		}

	}

	private void queryForTasks(TaskRepository taskRepository) {
		//get list of tasks
		List<Task> taskList = taskRepository.findAll();
		//display task of students
		for (Task tempTask: taskList){
			System.out.println(tempTask);
		}
	}

	*//*private void readTask(TaskRepository taskRepository) {

		//create a task object
		System.out.println("Creating a new task");
		Task tempTask =new Task("Login Project", "Create Password",LocalDateTime.now(),
				LocalDateTime.of(2023, 12, 25, 19, 35), true);
		// save the task
		System.out.println("Saving the task");
		taskRepository.save(tempTask);
		// display the id of the saved task
		int theID = Math.toIntExact(tempTask.getId());
		System.out.println("Saved Task. Generated id: "+theID);

		// retrieve task based on the id: primary key
		System.out.println("Retrieving task with id: "+theID);
		Task myTask = taskRepository.findByiD(theID);

		//display task

		System.out.println("Display the task: "+myTask);
	}*//*

	private void createTask(TaskRepository taskRepository) {

		//create the task object
		System.out.println("Creating new task: ");
		Task tempTask = new Task("Login Project", "Create Password",LocalDateTime.now(),
				LocalDateTime.of(2023, 12, 25, 19, 35), true);

		//save the task object
		System.out.println("Saving the task:");
		taskRepository.save(tempTask);

		//display id of the saved task
		System.out.println("Saved task. Generated id: "+  tempTask.getId());
	}*/
=======

	}


>>>>>>> 76f4875 (Initial commit)
}
