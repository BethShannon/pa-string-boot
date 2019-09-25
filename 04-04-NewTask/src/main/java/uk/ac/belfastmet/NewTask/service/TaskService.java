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
	private ArrayList<Task> firstTask; //Instance variable
	private ArrayList<Task> secondTask; 

	/**
	 * 
	 * @return 
	 */
	public ArrayList<Task> getFirstTask(){

		this.firstTask = new ArrayList<Task>();

		this.firstTask.add(new Task("Do Food Shopping", "Weekly Food Shop", "Mum", "Medium Priority"));
		this.firstTask.add(new Task("Revise Java for exam", "Revise", "Beth", "High Priority"));
		return this.firstTask;
	}
	
	public void getNumberofTasks(){
		logger.info("# of tasks: {}", taskRepository.count());

		Iterable <Task> tasks = taskRepository.findAll();
		Iterator <Task> iterator = tasks.iterator();
		while(iterator.hasNext()) {
			logger.info("{}", iterator.next().toString());
		}
	}
	/**
	 * 
	 * @return
	 */
	public ArrayList<Task> getSecondTask(){

		this.secondTask = new ArrayList<Task>();

		this.secondTask.add(new Task("Go to Post Office", "Post Letter", "Dad", "High Priority"));
		this.secondTask.add(new Task("Go to vets", "Pick up Cat", "Sarah", "Medium Priority"));
		return this.secondTask;
	}
	
}
	