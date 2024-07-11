package com.check.junit.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DateController {
	@RequestMapping("/date")
	public String dateDisplay(Model model) {
		model.addAttribute("dateMsg","Today's Date ::"+ new Date());
		
		String str2 = null;
		str2.length();
		return "date";
	}
	
}
