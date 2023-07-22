package com.everestcorp.coldstorage.apps.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String getHello(Model model) {
		model.addAttribute("hello","Hello Spring Boot User");
		return "hello";
	}
	
}
