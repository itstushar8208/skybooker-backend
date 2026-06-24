 package com.skybooker.service;

import com.skybooker.dto.UserRegistrationRequest;
import com.skybooker.entity.User;

public interface UserService {

    User registerUser(UserRegistrationRequest request);

}