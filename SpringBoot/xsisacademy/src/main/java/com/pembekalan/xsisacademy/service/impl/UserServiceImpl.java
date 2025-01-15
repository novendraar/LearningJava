package com.pembekalan.xsisacademy.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pembekalan.xsisacademy.controller.dto.request.userRequest;
import com.pembekalan.xsisacademy.controller.dto.response.userResponse;
import com.pembekalan.xsisacademy.entity.User;
import com.pembekalan.xsisacademy.repository.UserRepository;
import com.pembekalan.xsisacademy.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    private ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Override
    public List<userResponse> getAllUser() {
        List<User> users = userRepository.getAllUsers();
        List<userResponse> userResponses = users.stream().map(user -> modelMapper().map(user, userResponse.class))
                .collect(Collectors.toList());
        return userResponses;
    }

    @Override
    public userResponse getUserById(Integer id) {
        User user = userRepository.findById(id).orElse(null);
        userResponse userResponses = modelMapper().map(user, userResponse.class);
        return userResponses;
    }

    @Override
    public User saveUser(userRequest userRequests) {
        User user = modelMapper().map(userRequests, User.class);
        return userRepository.save(user);
    }

    @Override
    public void deleteByUserId(Integer id) {
        userRepository.deleteById(id);
    }

}
