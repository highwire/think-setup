package com.mps.think.setup.exception;

import java.util.Map;

public class InvalidOTPException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7649533240326885286L;
	private Map<String, String> errors;
	public InvalidOTPException(Map<String, String> errors) {
		super();
		this.errors = errors;
	}
	public Map<String, String> getErrors() {
		return errors;
	}
	public void setErrors(Map<String, String> errors) {
		this.errors = errors;
	}
	
}
