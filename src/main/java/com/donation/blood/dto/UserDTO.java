package com.donation.blood.dto;

import com.donation.blood.entities.Authorities;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class UserDTO {

    private String userId;
    private String userName;
    private String password;
    private String mail;
    private Boolean isAccountNonExpired;
    private Boolean isAccountNonLocked;
    private Boolean isCredentialsNonExpired;
    private Boolean isEnabled;
    List<String> authorities;
}
