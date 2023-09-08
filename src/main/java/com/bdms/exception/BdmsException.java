package com.bdms.exception;

import org.springframework.http.HttpStatus;

import lombok.Data;

@Data
public class BdmsException extends RuntimeException {

	private String message;

	private HttpStatus code;

	public BdmsException(String message, HttpStatus code) {
		super(message);
		this.code = code;
		this.message = message;
	}
}
