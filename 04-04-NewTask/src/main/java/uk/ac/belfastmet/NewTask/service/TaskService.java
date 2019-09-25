package uk.ac.belfastmet.NewTask.service;

import java.util.ArrayList;
import java.util.Iterator;

import uk.ac.belfastmet.NewTask.domain.*;
import uk.ac.belfastmet.NewTask.repository.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TaskService {

	@Autowired
	private TaskRepository taskRepository;
	private static Logger logger = LoggerFactory.getLogger(TaskService.class);
	//private ArrayList<Task> firstTask; //Instance variable
	//private ArrayList<Task> secondTask; 

	/**
	 * 
	 * @return 
	 */
	/*
	public ArrayList<Task> getFirstTask(){

		this.firstTask = new ArrayList<Task>();

		this.firstTask.add(new Task("Do Food Shopping", "Weekly Food Shop", "Mum", "Medium Priority"));
		this.firstTask.add(new Task("Revise Java for exam", "Revise", "Beth", "High Priority"));
		return this.firstTask;
	}
	
	/**
	 * Handles all SQL
	 */
	public Iterable<Task> getFirstNumberofTasks(){
		logger.info("# of task: {}", taskRepository.count());

		Iterable <Task> task = taskRepository.findAll();
		Iterator <Task> iterator = task.iterator();
	//	ArrayList<Task> tasklist = new ArrayList<Task>();
		while(iterator.hasNext()) {
			logger.info("{}", iterator.next().toString());
			
		}
		return task;
	}
	/**
	 * 
	 * @return
	 */
	
	public Iterable<Task> getSecondNumberofTasks(){
	
	logger.info("# of task: {}", taskRepository.count());

		Iterable <Task> task = taskRepository.findAll();
		Iterator <Task> iterator = task.iterator();
		while(iterator.hasNext()) {
			logger.info("{}", iterator.next().toString());
		}
		return task;



	
	}
	

}

	