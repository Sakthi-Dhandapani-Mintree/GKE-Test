package com.playeraction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping("home1")
	public String home1() {
		return "Home -->1";
	}
	@GetMapping("home2")
	public String home2() {
		return "Home -->2";
	}
}
