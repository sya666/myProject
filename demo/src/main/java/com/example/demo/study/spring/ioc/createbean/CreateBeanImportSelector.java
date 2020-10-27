package com.example.demo.study.spring.ioc.createbean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * @author sya
 * @Description
 * @date 2020-10-21 9:41
 */
@Component
public class CreateBeanImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{CreateBean.class.getName()};
    }
}
