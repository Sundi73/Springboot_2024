package com.check.junit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeScreen {
	@RequestMapping("/welcome")
	public String welcome(Model model) {
		model.addAttribute("msg", "Welcome To Ashutosh Mackbook");
		
		String str = null;
		str.length();
		return "welcome";
	}
	
	
	

}
