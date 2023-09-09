package com.bdms.mappers;

import com.bdms.dto.UserDTO;
import com.bdms.entities.User;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "Spring")
public interface UserMapper {

	UserDTO fromEntityToDTO(User user);
}
