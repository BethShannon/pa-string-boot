package uk.ac.belfastmet.dwarfs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import uk.ac.belfastmet.dwarfs.service.DwarfService;

@Controller
@RequestMapping

public class DwarfsController {

	/**
	 * 
	 * @returns the index file
	 */
	@GetMapping("/index")
	public String homePage() {
		
		return "index";
	}
	
	/**
	 * 
	 * @param model supplies attributes for disney page
	 * @returns the disney file
	 */
	@GetMapping("/disney")
	public String disneyPage(Model model) {
		
		DwarfService dwarfService = new DwarfService();
		model.addAttribute("pageTitle", "Disney Dwarfs");
		model.addAttribute("dwarfs", dwarfService.getDisneyDwarfs());
		return "disney";
	}
	/**
	 * 
	 * @param model supplies attributes for tolkein page
	 * @returns the tolkein file
	 */
	@GetMapping("/tolkien")
	public String tolkienPage(Model model) {
		
		DwarfService dwarfService = new DwarfService();
		model.addAttribute("pageTitle", "Tolkien Dwarfs");
		//kevin - line broken because getTolkienDwarfs doesn't currently exist
		model.addAttribute("dwarfs", dwarfService.getTolkienDwarfs());
		
		return "tolkien";
	}
	
}
