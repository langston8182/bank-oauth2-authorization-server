package com.cmarchive.bank.bankoauth2authorizationserver.exception;

public class UserNotFoundException extends RuntimeException {

	private String msg;

	public UserNotFoundException(String msg) {
		super();
		this.msg = msg;
	}
	
	
	
}
