package com.example.demo.study.spring.ioc.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author sya
 * @Description 测试bean作用域 实体
 * @date 2020-10-20 10:52
 */
@Configuration
public class BeanScopeBean {

    public BeanScopeBean() {
        System.out.println("实例化 BeanScopeBean");
    }

//    @Bean
    public BeanScopeBean beanScopeBean(){
        return  new BeanScopeBean();
    }

}
