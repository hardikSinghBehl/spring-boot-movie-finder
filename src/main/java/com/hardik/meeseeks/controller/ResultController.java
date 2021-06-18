package com.hardik.meeseeks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hardik.meeseeks.constant.Template;
import com.hardik.meeseeks.service.MovieService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class ResultController {

	private final MovieService movieService;

	@PostMapping("/result")
	public String result(@RequestParam("title") final String movieTitle, final Model model) {
		final var response = movieService.find(movieTitle);

		model.addAttribute("movie", movieService.find(movieTitle).getBody());
		model.addAttribute("status", "success");
		return Template.RESULT;
	}

}
