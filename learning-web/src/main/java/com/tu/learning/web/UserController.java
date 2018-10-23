package com.tu.learning.web;

import com.tu.learning.model.User;
import com.tu.learning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "haha")
    public List<User> haha(){
        List<User> userList = userService.getAllUser();
        return userList;
    }
}
