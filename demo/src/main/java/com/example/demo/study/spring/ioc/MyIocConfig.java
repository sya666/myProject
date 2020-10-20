package com.example.demo.study.spring.ioc;

import com.example.demo.user.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sya
 * @Description
 * @date 2020-10-19 9:32
 */
@Configuration
public class MyIocConfig {

    @Bean(name = "user")
    public User getUser(){
        return new User();
    }

}
