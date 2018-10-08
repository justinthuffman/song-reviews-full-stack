package org.wecancodeit.songreviews.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wecancodeit.songreviews.repositories.SongRepository;

@Controller
public class SongController {

	@Resource
	private SongRepository songRepo = new SongRepository();

	// Request
	@GetMapping("/songs")
	public String getSong(Model model) {
		model.addAttribute("songs", songRepo.findAll());
		return "songs";
	}

	@GetMapping("/songs/{id}")
	public String getSongs(@PathVariable(value = "id") Long id, Model model) {
		System.out.println(songRepo.findOne(id));
		model.addAttribute("song", songRepo.findOne(id));
		return "song";
	}
}