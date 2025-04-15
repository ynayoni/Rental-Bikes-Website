package com.example.rentalbikesbackend.services;

import com.example.rentalbikesbackend.entities.User;
import com.example.rentalbikesbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user){
        return userRepository.save(user);
    }

    public User getUserByEmail(String email){
        return userRepository.findByEmail(email);
    }
}
