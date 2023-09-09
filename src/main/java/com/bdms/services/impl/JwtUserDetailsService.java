package com.bdms.services.impl;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.bdms.dto.BdmsUserDetails;
import com.bdms.dto.UserDTO;
import com.bdms.services.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class JwtUserDetailsService implements UserDetailsService {

	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDTO userByUsername = userService.getUserByUserName(username);
		BdmsUserDetails bdmsUserDetails = new BdmsUserDetails();
		bdmsUserDetails.setUsername(userByUsername.getUserName());
		bdmsUserDetails.setPassword(userByUsername.getUserName());
		bdmsUserDetails.setMail(userByUsername.getEmail());
		return bdmsUserDetails;
	}
}
