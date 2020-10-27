package com.example.demo.study.spring.ioc.createbean;

        import com.alibaba.fastjson.JSON;
        import org.springframework.context.annotation.AnnotationConfigApplicationContext;

        import java.util.Map;

/**
 * @author sya
 * @Description
 * @date 2020-10-19 9:26
 */
public class CreateBeanTest {

    public static void main(String[] args) {
        //传统xml格式获取bean
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Object createBean = context.getBean("createBean");
//        System.out.println(createBean);

//        //通过注解获取bean
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyCreateBeanConfig.class);
//        Object createBean = context.getBean("createBean");
//        System.out.println(createBean);

        //通过import将bean放到容器中
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyCreateBeanConfig.class);
//        Object createBean = context.getBean("com.example.demo.study.spring.ioc.createbean.CreateBean");
//        System.out.println(createBean);

        //通过@import + ImportBeanDefinitionRegistrar
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyCreateBeanConfig.class);
//        Object createBean = context.getBean("createBean");
//        System.out.println(createBean);

        //通过@import + FactoryBean
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyCreateBeanConfig.class);
        Object createBean = context.getBean(CreateBean.class);
        System.out.println(createBean);




    }
}
