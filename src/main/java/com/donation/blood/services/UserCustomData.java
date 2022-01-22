package com.donation.blood.services;

import com.donation.blood.entities.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserCustomData extends User implements UserDetails {

    public UserCustomData() {
    }

    public UserCustomData(User user) {
        this.setIsEnabled(user.getIsEnabled());
        this.setAuthoritiesSet(user.getAuthoritiesSet());
        this.setUserName(user.getUserName());
        this.setIsCredentialsNonExpired(user.getIsCredentialsNonExpired());
        this.setIsAccountNonExpired(user.getIsAccountNonExpired());
        this.setIsAccountNonLocked(user.getIsAccountNonLocked());
        this.setPassword(user.getPassword());
        this.setIsAccountNonLocked(user.getIsAccountNonLocked());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getAuthoritiesSet();
    }

    @Override
    public String getUsername() {
        return getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return getIsAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return getIsAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return getIsCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
