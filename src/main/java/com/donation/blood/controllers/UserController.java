package com.donation.blood.controllers;

import com.donation.blood.dto.UserDTO;
import com.donation.blood.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/createUser")
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        return userService.createUser(userDTO);
    }

    @GetMapping("{id}")
    public UserDTO getUser(@PathVariable String userId) {
        return userService.getUser(userId);
    }
}
