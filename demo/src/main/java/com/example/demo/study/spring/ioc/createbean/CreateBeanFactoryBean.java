package com.example.demo.study.spring.ioc.createbean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author sya
 * @Description
 * @date 2020-10-21 10:32
 */
public class CreateBeanFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        return new CreateBean();
    }

    @Override
    public Class<?> getObjectType() {
        return CreateBean.class;
    }
}
