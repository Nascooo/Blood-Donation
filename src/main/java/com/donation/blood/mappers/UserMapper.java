package com.donation.blood.mappers;

import com.donation.blood.dto.UserDTO;
import com.donation.blood.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface UserMapper {

    UserDTO fromEntityToDTO(User user);
}
