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

	@GetMapping("/index")
	public String homePage() {
		logger.info("An Info message beth");
		return "index";

	}
	/**
	 * 
	 * @return This method is getting the index2 file
	 */

	@GetMapping("/index2")
	public String homePage2() {
		logger.info("An Info message beth");
		return "index2";

	}
	/**
	 * 
	 * @param model 
	 * @return This method gets the artist file
	 */

	@GetMapping("/artist")
	public String artistPage(Model artistModel) {
		TopTenService toptenservice = new TopTenService();
		artistModel.addAttribute("pageTitle", "artist");
		artistModel.addAttribute("artist", toptenservice.getArtistTopTen());
		return "artist";
	}

	@GetMapping("/album")
	public String albumPage(Model albumModel) {

		TopTenService toptenservice = new TopTenService();
		albumModel.addAttribute("pageTitle", "album");
		albumModel.addAttribute("album", toptenservice.getAlbumTopTen());

		return "album";
	}

}
