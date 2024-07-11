package com.check.junit.exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
@ControllerAdvice
public class AppExceptionHandle {

	@ExceptionHandler(NullPointerException.class)
	public String handleNullPointerException(Model model) {
		
		model.addAttribute("msg", "Some Message Occoured Problem");
		
		return "error";
	}
	
}
