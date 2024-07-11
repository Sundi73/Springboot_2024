package com.annotation.check.controller;

import org.springframework.stereotype.Component;

@Component
public class FoodController {
	
	public String hotFood() {
		return "Food is very hot";
	}

}
