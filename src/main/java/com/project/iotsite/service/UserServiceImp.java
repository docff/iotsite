package com.project.iotsite.service;

import com.project.iotsite.entity.User;
import com.project.iotsite.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository usrRep;

    @Override
    public List<User> findByname(String name) {
        return usrRep.findByname(name);
    }

    @Override
    public List<User> findAll() {
        return usrRep.findAll();
    }

    @Override
    public User save(User d) {
        return usrRep.save(d);
    }

    @Override
    public void delete(Long id) {
        usrRep.deleteById(id);
    }

    @Override
    public void delete(User d) {
        usrRep.delete(d);
    }

}