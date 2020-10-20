package com.example.demo.user.service;

import com.example.demo.user.domain.User;
import com.example.util.PageUtil;

/**
 * @author sya
 * @Description
 * @date 2020-08-31 17:33
 */
public interface UserService {
    PageUtil<User> queryUserPage();

}
