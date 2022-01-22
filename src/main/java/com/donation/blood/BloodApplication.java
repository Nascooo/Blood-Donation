package com.donation.blood;

import com.donation.blood.constant.Roles;
import com.donation.blood.entities.Authorities;
import com.donation.blood.entities.User;
import com.donation.blood.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;
import java.util.Set;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BloodApplication implements CommandLineRunner {

    @Autowired
    private UserRepo repo;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(BloodApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
    }
}
