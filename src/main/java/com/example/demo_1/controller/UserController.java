package com.example.demo_1.controller;

import com.example.demo_1.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户控制器
 *
 * @author 努力的派大星
 * @version 1.0
 * @date 2023/02/22
 */
@RestController
public class UserController {
    @Resource
    private UserService userService;

    /**
     * 得到列表
     *
     * @return {@link List}
     */
    @GetMapping
    public List getList(){
        return userService.list();
    }

    /**
     * 通过id获取名称
     *
     * @param id id
     * @return {@link String}
     */
    @GetMapping("/hello/{id}")
    public String getNameById(@PathVariable("id") Integer id){
        return userService.getNameById(id).getName();
    }
}
