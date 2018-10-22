package org.wecancodeit.songreviews.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wecancodeit.songreviews.repositories.SongRepository;

@Controller
@RequestMapping("/songs")
public class SongController {

	@Resource
	SongRepository songRepo;

	@RequestMapping("")
	public String listSongs(Model model) {
		model.addAttribute("songs", songRepo.findAll());
		return "songs/index";
	}

	@RequestMapping("/{id}")
	public String listSongs(@PathVariable(value = "id") Long id, Model model) {
		return "songs/song";
	}
}