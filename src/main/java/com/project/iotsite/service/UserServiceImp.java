package com.project.iotsite.service;

import com.project.iotsite.entity.User;
import com.project.iotsite.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findByname(String name) {
        return userRepository.findByname(name);
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User d) {
        return userRepository.save(d);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public void delete(User d) {
        userRepository.delete(d);
    }

    @Override
    public User findById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public User findByUsername(String username){
        return userRepository.findByUsername(username);
    }

    @Override
    public List<User> findByNameContaining(String searchterm){
        return userRepository.findByNameContaining(searchterm);
    }

}