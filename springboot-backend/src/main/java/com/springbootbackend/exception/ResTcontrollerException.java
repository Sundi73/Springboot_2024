package com.springbootbackend.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class ResTcontrollerException {
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiErrorHandle> handleNoUserFoundException(){
		ApiErrorHandle apiError = new ApiErrorHandle(400,"No User found",new Date());
		return new ResponseEntity<ApiErrorHandle>(apiError,HttpStatus.BAD_REQUEST);
	}

}
