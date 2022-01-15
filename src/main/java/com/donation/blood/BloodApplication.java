package com.donation.blood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class BloodApplication {

    public static void main(String[] args) {
        SpringApplication.run(BloodApplication.class, args);
    }
}
