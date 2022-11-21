package com.mps.think.setup.exception;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(InvalidOTPException.class)
	public final ResponseEntity<ErrorDetails> handleFormExceptions(InvalidOTPException ex, WebRequest request) {
		ErrorDetails errorDetails = new ErrorDetails("INVALID_OTP", request.getDescription(false),
				HttpStatus.UNAUTHORIZED, ex.getErrors());
		//ex.printStackTrace();
		return new ResponseEntity<>(errorDetails, HttpStatus.UNAUTHORIZED);
	}
	
	
	@ExceptionHandler(DataIntegrityViolationException.class)
	public ResponseEntity<String> handleAlreadyExistsException(DataIntegrityViolationException dataIntegrityViolationException) {
	return new ResponseEntity<String>(dataIntegrityViolationException.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException noSuchElementException) {
	return new ResponseEntity<String>(noSuchElementException.getMessage(), HttpStatus.NOT_FOUND);
	}
	
//	@ExceptionHandler(NotFoundException.class)
//	public ResponseEntity<String> handleNotFoundException(NotFoundException notFoundException) {
//	return new ResponseEntity<String>(notFoundException.getMessage(),HttpStatus.NOT_FOUND);
//	}
	
    @ExceptionHandler(NotFoundException.class)
    public ResponseEntity<Object> handleNodataFoundException(
    		NotFoundException ex, WebRequest request) {

        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("message", "No cities found");

        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
    }
}
