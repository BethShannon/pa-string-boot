package uk.ac.belfastmet.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.belfastmet.service.TopTenService;


@Controller
public class TopTenController {
	Logger logger = LoggerFactory.getLogger(TopTenController.class);

	@GetMapping("index")
	public String homePage() {
		logger.info("An Info message beth");
		return "index";

	}
	
	@GetMapping("index2")
	public String homePage2() {
		logger.info("An Info message beth");
		return "index2";

	}
	
	@GetMapping("/artist")
	public String artistsPage(Model model) {

		TopTenService toptenservice = new TopTenService();
		model.addAttribute("pageTitle", "Artist");
		model.addAttribute("Artist", toptenservice.getArtistTopTen());
		return "artist";
	}

	@GetMapping("/album")
	public String tolkienPage(Model model) {

		TopTenService toptenservice = new TopTenService();
		model.addAttribute("pageTitle", "Album");
		model.addAttribute("Album", toptenservice.getAlbumTopTen());

		return "album";
	}

}
