package com.pembekalan.xsisacademy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pembekalan.xsisacademy.controller.dto.request.userRequest;
import com.pembekalan.xsisacademy.controller.dto.response.userResponse;
import com.pembekalan.xsisacademy.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/user")
public class userController {

    @Autowired
    UserService userService;

    @GetMapping("")
    public ModelAndView getAllUsers() {
        ModelAndView view = new ModelAndView("user/index");
        List<userResponse> users = userService.getAllUser();
        String title = "User Page";
        view.addObject("title", title);
        view.addObject("users", users);
        return view;
    }

    @GetMapping("/form")
    public ModelAndView userForm() {
        ModelAndView view = new ModelAndView("user/form");
        userResponse user = new userResponse();
        view.addObject("user", user);
        return view;
    }

    @PostMapping("/save")
    public ModelAndView saveUser(@ModelAttribute userRequest user, BindingResult result) {
        if (!result.hasErrors()) {
            userService.saveUser(user);
        }
        return new ModelAndView("redirect:/user");
    }

    @GetMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable Integer id) {
        ModelAndView view = new ModelAndView("user/form");
        userResponse user = userService.getUserById(id);
        view.addObject("user", user);
        return view;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView delete(@PathVariable Integer id) {
        userService.deleteByUserId(id);
        return new ModelAndView("redirect:/user");
    }

}
