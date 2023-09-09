package com.bdms.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bdms.config.JwtTokenUtils;
import com.bdms.dto.BdmsUserDetails;
import com.bdms.dto.UserDTO;
import com.bdms.services.impl.JwtUserDetailsService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/login")
@AllArgsConstructor
public class LoginController {

	private JwtUserDetailsService jwtUserDetailsService;

	private JwtTokenUtils jwtTokenUtils;

	@PostMapping
	public ResponseEntity<Object> authenticateUser(@RequestBody UserDTO userDTO) {
		UserDetails userDetails = jwtUserDetailsService.loadUserByUsername(userDTO.getUserName());
		String s = jwtTokenUtils.generateToken(userDetails);
		return ResponseEntity.ok(s);
	}
}
