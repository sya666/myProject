package com.example.demo.study.spring.ioc.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author sya
 * @Description
 * @date 2020-10-20 10:54
 */
public class BeanScopeBeanTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }
}
