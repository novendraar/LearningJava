package com.pembekalan.xsisacademy.service;

import java.util.List;

import com.pembekalan.xsisacademy.controller.dto.request.userRequest;
import com.pembekalan.xsisacademy.controller.dto.response.userResponse;
import com.pembekalan.xsisacademy.entity.User;

public interface UserService {
    List<userResponse> getAllUser();

    userResponse getUserById(Integer id);

    User saveUser(userRequest user);

    void deleteByUserId(Integer id);
}
