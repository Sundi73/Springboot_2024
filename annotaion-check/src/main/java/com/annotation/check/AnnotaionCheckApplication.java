package com.annotation.check;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.annotation.check.controller.FoodController;

@SpringBootApplication
public class AnnotaionCheckApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(AnnotaionCheckApplication.class, args);
		FoodController bean1 = context.getBean(FoodController.class);
		System.out.println(bean1.hotFood());
	}

}
