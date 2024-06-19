package com.restApi.markerSharks.restful_services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restApi.markerSharks.restful_services.model.User;
import com.restApi.markerSharks.restful_services.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(User user) {
        // Implement logic to store user in the database
        return userRepository.save(user);
    }

    public User fetchUserByUsername(String username) {
        // Implement logic to fetch user by username
        return userRepository.findByUsername(username);
    }
}
