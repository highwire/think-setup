package com.mps.think.setup.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;

public class ErrorDetails {

	private String date;
	private String message;
	private String path;
	private HttpStatus status;
	private Object error;

	public ErrorDetails(String message, String path, HttpStatus status, Object error) {
		super();
		this.date = new Date().toString();
		this.message = message;
		this.path = path;
		this.status = status;
		this.error = error;
	}

	public String getDate() {
		return date;
	}

	public String getMessage() {
		return message;
	}

	public String getPath() {
		return path;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public Object getError() {
		return error;
	}
	
}
