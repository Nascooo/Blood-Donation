package com.bdms.exception;

import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BdmsException extends RuntimeException {

	private final String message;

	private final HttpStatus code;

	public BdmsException(String message, HttpStatus code) {
		super(message);
		this.code = code;
		this.message = message;
	}
}
