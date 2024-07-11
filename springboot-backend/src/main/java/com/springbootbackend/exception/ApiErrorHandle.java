package com.springbootbackend.exception;

public class ApiErrorHandle {
	
	private Integer errorCode;
	private String errorMessage;
	private java.util.Date Date;
	
	
	
	public ApiErrorHandle() {
		super();
	}
	public ApiErrorHandle(Integer errorCode, String errorMessage, java.util.Date date) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		Date = date;
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
	public java.util.Date getDate() {
		return Date;
	}
	public void setDate(java.util.Date date) {
		Date = date;
	}
	
	

}
