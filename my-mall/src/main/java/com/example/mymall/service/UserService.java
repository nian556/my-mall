package com.example.mymall.service;

import com.example.mymall.dto.UserLoginRequest;
import com.example.mymall.dto.UserRegisterRequest;
import com.example.mymall.model.User;

public interface UserService {

    User getById(Integer userId);
    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);

}
