package uk.ac.belfastmet.NewTask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.belfastmet.NewTask.service.TaskService;

@Controller
@RequestMapping

public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping ("/index")
	public String homePage() {

		return "index";
	}
	/**
	 * 
	 * @param firstmodel 
	 * @return the first list of tasks
	 **/
	@GetMapping ("/firstlist")
	public String firstlistPage(Model firstmodel) {

		taskService.getFirstNumberofTasks();
		firstmodel.addAttribute("pageTitle", "List No.1");
		firstmodel.addAttribute("firstlist", taskService.getFirstNumberofTasks());

		return "firstlist";
	}
	/**
	 * 
	 * @param secondmodel
	 * @return the second list of tasks
	 */
	@GetMapping ("/secondlist")
	public String secondlistPage(Model secondmodel) {

		taskService.getSecondNumberofTasks();
		secondmodel.addAttribute("pageTitle2", "List No.2");
		secondmodel.addAttribute("secondlist", taskService.getSecondNumberofTasks());
		
		return "secondlist";
		
		
	}
}
	

