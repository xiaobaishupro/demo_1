package com.example.demo_1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo_1.entity.User;
import com.example.demo_1.mapper.UserMapper;
import com.example.demo_1.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 努力的派大星
 * @version 1.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User getNameById(Integer id) {
        return userMapper.getNameById(id);
    }
}
