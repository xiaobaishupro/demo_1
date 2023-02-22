package com.example.demo_1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.demo_1.entity.User;

/**
 * @author 努力的派大星
 * @version 1.0
 */
public interface UserService extends IService<User> {
    User getNameById(Integer id);
}
