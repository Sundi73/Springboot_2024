package com.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
	
	@RequestMapping("/home")
	public String homeTemplate() {
		String text = "This home template where we use the concept of jwt to"
				+ " authenticate our user login and logout";
		
		return text;
	}

}
