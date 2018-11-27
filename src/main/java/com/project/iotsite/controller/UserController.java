package com.project.iotsite.controller;

import com.project.iotsite.entity.User;
import com.project.iotsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class UserController  {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public Collection<User> getAllUsers() {

        return  userService.findAll();
    }
}