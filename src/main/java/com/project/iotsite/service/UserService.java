package com.project.iotsite.service;

import com.project.iotsite.entity.User;

import java.util.List;

public interface UserService {


    List<User> findByname(String name);

    List<User> findAll();

    User save(User d);

    void delete(Long id);

    void delete(User p);
}

