package com.springboot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	
	@RequestMapping("/")
	public String home() {
		System.out.println("This is home Page....!!");
		return "home";
	}
	
	@RequestMapping("/contact")
	public String contact()
	{
		System.out.println("This is contact page...!!");
		return "contact";
	}
}
