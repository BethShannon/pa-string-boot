package uk.ac.belfastmet.NewTask.service;

import java.util.ArrayList;
import uk.ac.belfastmet.NewTask.domain.*;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

	private ArrayList<Task> firstTask; //Instance variable
	private ArrayList<Task> secondTask; 

/**
 * 
 * @return first task file
 */
	public ArrayList<Task> getFirstTask(){

		this.firstTask = new ArrayList<Task>();

		this.firstTask.add(new Task("Do Food Shopping", "Weekly Food Shop", "Mum", "Medium Priority", true));
		this.firstTask.add(new Task("Revise Java for exam", "Revise", "Beth", "High Priority", false));
		return this.firstTask;
	}

	/**
	 * 
	 * @return
	 */
	public ArrayList<Task> getSecondTask(){

		this.secondTask = new ArrayList<Task>();

		this.secondTask.add(new Task("Go to Post Office", "Post Letter", "Dad", "High Priority", false));
		this.secondTask.add(new Task("Go to vets", "Pick up Cat", "Sarah", "Medium Priority", true));
		return this.secondTask;
	}
}
// new array getTasks(); using an if (task.iscomplete) taskNew.add(task);
// use ! as not complete
	