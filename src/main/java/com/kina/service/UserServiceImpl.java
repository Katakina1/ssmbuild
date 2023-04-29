package com.kina.service;

import com.kina.dao.UserMapper;

import java.util.List;

public class UserServiceImpl implements UserService{
    private UserMapper userMapper;
    @Override
    public List<String> queryAllName() {
        return userMapper.queryAllName();
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }
}
