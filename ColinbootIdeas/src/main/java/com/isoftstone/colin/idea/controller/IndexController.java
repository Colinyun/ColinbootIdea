package com.isoftstone.colin.idea.controller;

import com.isoftstone.colin.idea.entity.User;
import com.isoftstone.colin.idea.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    private IUserService userService;

    @GetMapping("/")
    public List<User> index() {
        return userService.findAll();

    }
}
