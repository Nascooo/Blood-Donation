package com.bdms.services.impl;

import static com.bdms.constant.BdmsConstants.NOT_EXIST;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bdms.dto.UserDTO;
import com.bdms.entities.User;
import com.bdms.exception.BdmsException;
import com.bdms.mappers.UserMapper;
import com.bdms.repos.UserRepository;
import com.bdms.services.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;

	private UserMapper userMapper;

	@Override
	public UserDTO getUserByUserName(String userName) {
		Optional<User> optionalPatient = userRepository.findUserByUserName(userName);
		return optionalPatient.map(userMapper::fromEntityToDTO).orElseThrow(() -> new BdmsException(NOT_EXIST, HttpStatus.NOT_FOUND));
	}
}
