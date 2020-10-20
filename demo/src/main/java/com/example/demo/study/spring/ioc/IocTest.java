package com.example.demo.study.spring.ioc;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sya
 * @Description
 * @date 2020-10-19 9:26
 */
public class IocTest {

    public static void main(String[] args) {
        //传统xml格式获取bean
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Object user = context.getBean("user");
//        System.out.println(user);

        //通过注解获取bean
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyIocConfig.class);
        Object user = context.getBean("user");
        System.out.println(user);




    }
}
