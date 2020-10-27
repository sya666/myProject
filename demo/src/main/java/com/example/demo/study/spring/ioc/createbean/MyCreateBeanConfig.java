package com.example.demo.study.spring.ioc.createbean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author sya
 * @Description
 * @date 2020-10-19 9:32
 */
@Configuration
//@Import(CreateBean.class)
//@Import(value = {CreateBeanImportSelector.class})
//@Import(value = {CreateBeanDefinitionRegister.class})
@Import(value = {CreateBeanFactoryBean.class})
public class MyCreateBeanConfig {
    public MyCreateBeanConfig() {
        System.out.println("MyCreateBeanConfig实例化了。。。。。。");


    }

//    @Bean(name = "createBean")
//    public CreateBean getCreateBean(){
//        return new CreateBean();
//    }

}
