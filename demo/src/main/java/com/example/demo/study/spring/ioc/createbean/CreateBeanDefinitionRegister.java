package com.example.demo.study.spring.ioc.createbean;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author sya
 * @Description
 * @date 2020-10-21 9:53
 */
public class CreateBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {

    @Override
    public  void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //创建一个bean定义对象        
         RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(CreateBean.class);
        //把bean定义对象导入到容器中     
        registry.registerBeanDefinition("createBean",rootBeanDefinition);
    }
}
