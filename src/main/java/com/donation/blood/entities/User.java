package com.donation.blood.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Set;

@Data
@Document("User")
public class User {
    @Id
    private String userId;
    private String userName;
    private String password;
    private String mail;
    private Boolean isAccountNonExpired;
    private Boolean isAccountNonLocked;
    private Boolean isCredentialsNonExpired;
    private Boolean isEnabled;
    Set<Authorities> authoritiesSet;


}
