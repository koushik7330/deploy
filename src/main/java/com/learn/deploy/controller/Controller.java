package com.learn.deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
	
	@GetMapping("/")
	public String home() {
		return "Home Page";
	}
	
	@GetMapping("/about")
	public String about() {
		return "About Paage";
	}

	

}
