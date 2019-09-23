package uk.ac.belfastmet.NewTask.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.NewTask.service.TaskService;

@Controller
@RequestMapping

public class TaskController {

	@GetMapping ("/index")
	public String homePage() {

		return "index";

	}

	@GetMapping ("/firstlist")
	public String firstlistPage(Model firstmodel) {
		
		TaskService firstTask = new TaskService();
		firstmodel.addAttribute("pageTitle", "List No 1.");
		firstmodel.addAttribute("firstlist", firstTask.getFirstTask());

		return "firstlist";
	}

	@GetMapping ("/secondlist")
	public String secondlistPage(Model secondmodel) {
		
		TaskService secondTask = new TaskService();
		secondmodel.addAttribute("pageTitle2", "List No.2");
		secondmodel.addAttribute("secondlist", secondTask.getSecondTask());
		
		return "secondlist";
		
		
	}
	
	}

