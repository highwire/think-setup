package com.mps.think.setup.exception;

public class EmptyInputException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private String errorCode;
	private String errormessage;
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrormessage() {
		return errormessage;
	}
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}
	public EmptyInputException(String errorCode, String errormessage) {
		super();
		this.errorCode = errorCode;
		this.errormessage = errormessage;
	}
	
	public EmptyInputException() {
		
	}
	

}

