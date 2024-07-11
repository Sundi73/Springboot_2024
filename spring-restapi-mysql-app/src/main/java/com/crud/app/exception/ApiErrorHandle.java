package com.crud.app.exception;

import java.util.Date;

public class ApiErrorHandle {
	
	private Integer errorCode;
	private String errorMessage;
	private Date date;
	
	
	public ApiErrorHandle(Integer errorCode, String errorMessage, Date date) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.date = date;
	}


	public Integer getErrorCode() {
		return errorCode;
	}


	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}


	public String getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}

	
	
	
}
