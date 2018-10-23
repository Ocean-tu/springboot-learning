package com.tu.learning.serviceimpl;

import com.tu.learning.dao.UserMapper;
import com.tu.learning.model.User;
import com.tu.learning.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }
}
