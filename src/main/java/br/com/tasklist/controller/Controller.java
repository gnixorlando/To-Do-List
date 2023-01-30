package br.com.tasklist.controller;

import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.tasklist.models.Task;
import br.com.tasklist.repository.TaskRepository;

@RestController
public class Controller {
	
	@Autowired
	private TaskRepository taskRepository;
	
	@RequestMapping(value = "/initial/{taskname}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public String initial (@PathVariable String taskname) {
		Task task = new Task();
		task.setTaskName(taskname);
		
		taskRepository.save(task);
		return "Task Created: " + taskname;
	
	}
}
