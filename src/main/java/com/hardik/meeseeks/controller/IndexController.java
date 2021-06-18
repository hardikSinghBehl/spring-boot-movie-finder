package com.hardik.meeseeks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.hardik.meeseeks.constant.Template;

@Controller
public class IndexController {

	@GetMapping(value = { "/index", "/" })
	public String indexHandler() {
		return Template.INDEX;
	}

}
