package com.example.mymall.dao;

import com.example.mymall.dto.UserRegisterRequest;
import com.example.mymall.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    User getUserByEmail(String email);
    Integer createUser(UserRegisterRequest userRegisterRequest);
}
