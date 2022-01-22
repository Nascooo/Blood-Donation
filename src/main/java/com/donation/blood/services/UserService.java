package com.donation.blood.services;

import com.donation.blood.constant.Roles;
import com.donation.blood.dto.UserDTO;
import com.donation.blood.entities.Authorities;
import com.donation.blood.entities.User;
import com.donation.blood.mappers.UserMapper;
import com.donation.blood.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserMapper mapper;

    public UserDTO createUser(UserDTO userDTO) {
        User user = new User();
        user.setUserName(userDTO.getUserName());
        user.setPassword(bCryptPasswordEncoder.encode(userDTO.getPassword()));
        user.setIsEnabled(true);
        user.setIsAccountNonExpired(true);
        user.setIsCredentialsNonExpired(true);
        Authorities userRole = new Authorities();
        userRole.setName("User Role normal User");
        userRole.setAuthority(Roles.USER.name());
        user.setAuthoritiesSet(Set.of(userRole));
        userDTO = mapper.fromEntityToDTO(repo.save(user));
        return userDTO;
    }
}
