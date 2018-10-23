package com.tu.learning.dao;

import com.tu.learning.common.utils.MyMapper;
import com.tu.learning.model.User;

import java.util.List;

public interface UserMapper extends MyMapper<User> {

    List<User> getAllUser();
}
