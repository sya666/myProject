package com.example.demo.user.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.user.domain.User;
import com.example.demo.user.mapper.UserMapper;
import com.example.demo.user.service.UserService;
import com.example.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author sya
 * @Description
 * @date 2020-08-31 17:33
 */
@Service
public class UserServiceImpl implements UserService {
//    @Resource
//    private UserMapper userMapper;
    @Override
    public PageUtil<User> queryUserPage() {
        QueryWrapper<User> query = new QueryWrapper<User>();
//        List<User> users = userMapper.selectList(query);
//        System.out.println(JSON.toJSONString(users));
        return null;
    }
}
