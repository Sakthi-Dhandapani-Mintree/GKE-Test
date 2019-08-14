package com.kalingauniversity.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("prod")
public class MyProdController {
	@RequestMapping("/")
	public String welcome() {
		return "Welcome Prod Controller";
	}

}