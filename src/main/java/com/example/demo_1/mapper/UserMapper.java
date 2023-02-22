package com.example.demo_1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo_1.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 努力的派大星
 * @version 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    User getNameById(Integer id);
}
