package com.bdms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

	private Long userId;

	private String firstName;

	private String password;

	private String userName;

	private String lastName;

	private String email;

	private String phoneNumber;

	private String bloodGroup;

	private String userType;
}
