package com.bdms.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler({ BdmsException.class })
	public ResponseEntity<BdmsExceptionResponse> handleStudentNotFoundException(BdmsException exception) {
		BdmsExceptionResponse bdmsExceptionResponse = new BdmsExceptionResponse(exception.getCode(), exception.getMessage());
		return ResponseEntity.status(exception.getCode()).body(bdmsExceptionResponse);
	}

}
