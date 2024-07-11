package com.crud.app.exception;

public class NoUserFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -3897692581547024590L;

	public NoUserFoundException(String msg) {
		super(msg);
	}

}
