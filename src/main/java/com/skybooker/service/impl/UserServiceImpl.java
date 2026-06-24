package com.skybooker.service.impl;

import org.springframework.stereotype.Service;

import com.skybooker.dto.UserRegistrationRequest;
import com.skybooker.entity.User;
import com.skybooker.repository.UserRepository;
import com.skybooker.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User registerUser(UserRegistrationRequest request) {

        User user = new User();

        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setPhoneNumber(request.getPhoneNumber());

        user.setRole("USER");

        return userRepository.save(user);
    }
}
