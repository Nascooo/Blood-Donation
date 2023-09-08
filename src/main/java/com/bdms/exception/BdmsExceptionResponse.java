package com.bdms.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BdmsExceptionResponse {

	private HttpStatus responseCode;
	private String responseMessage;
}
