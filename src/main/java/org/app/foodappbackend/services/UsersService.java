package org.app.foodappbackend.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.app.foodappbackend.models.Users;
import org.app.foodappbackend.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UsersService {

    @Autowired
    private UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();



    public Users getUsersByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public List<Users> findAll() {
        return userRepository.findAll();
    }

    public Users findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }


    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    public Users registerUser(Users users) {
        return userRepository.save(users);
    }
}

