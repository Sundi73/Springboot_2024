package com.crud.app.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class RestExceptionController {

	@ExceptionHandler(NoUserFoundException.class)
	public ResponseEntity<ApiErrorHandle> handleNoUserFoundException() {
		
		ApiErrorHandle error = new ApiErrorHandle(400, "No User Found", new Date());
		return new ResponseEntity<ApiErrorHandle>(error,HttpStatus.BAD_REQUEST);
	}
	
}
