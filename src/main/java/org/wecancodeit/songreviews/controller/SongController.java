package org.wecancodeit.songreviews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wecancodeit.songreviews.repositories.SongRepository;

@Controller
public class SongController {

	private SongRepository songRepo = new SongRepository();

	// Request
	@GetMapping("/songs")
	public String getSong(Model model) {
		/*
		 * Response
		 * 
		 * Anything being added to the model is building the model
		 * 
		 * Once the model is built, it is sent to the specified view, in this case
		 * 'students', which is then populated by the information in the model
		 * 
		 * The resulting generated HTML page is then sent back to the client.
		 * 
		 */
		model.addAttribute("songs", songRepo.findAll());
		return "songs";
	}

	@GetMapping("/songs/{id}") // Using a PathVariable to dynamically get student id
	public String getSongs(@PathVariable(value = "id") Long id, Model model) {
		System.out.println(songRepo.findOne(id));
		model.addAttribute("song", songRepo.findOne(id));
		return "songs";
	}
}