package com.example.demo.study.spring.compentScan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author sya
 * @Description
 * @date 2020-10-19 9:40
 */
@MapperScan(basePackages = {"com.example.demo.*.mapper"})
public class ComponentScanTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context  = new AnnotationConfigApplicationContext(MyComponentScanConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

}
