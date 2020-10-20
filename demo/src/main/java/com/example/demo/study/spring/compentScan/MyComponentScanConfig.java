package com.example.demo.study.spring.compentScan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

/**
 * @author sya
 * @Description
 * @date 2020-10-19 9:49
 */
@Configuration
@ComponentScan(basePackages = {"com.example.demo.user"})
 //excludeFilters(排除@Controller注解的,和UserService的
/**
 * @ComponentScan(basePackages = {"com.example.demo.user"},excludeFilters = {
 *         @ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class),
 *         @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,value = UserService.class)
 * })
 */

//包含用法 includeFilters ,注意，若使用包含的用法，需要把useDefaultFilters属性设置为false（true表示扫描全部的）
/**
 * @ComponentScan(basePackages = {"com.example.demo.user"},includeFilters = {
 *         @ComponentScan.Filter(type = FilterType.ANNOTATION,value = {Controller.class, Service.class})
 * },useDefaultFilters = false)
 */
//自定义类型
@ComponentScan(basePackages = {"com.example.demo.user"},includeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyComponentScanFilterType.class})
},useDefaultFilters = false)
public class MyComponentScanConfig {
}
