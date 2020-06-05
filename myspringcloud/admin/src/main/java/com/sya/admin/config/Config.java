package com.sya.admin.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author sya
 * @Description
 * @date 2020-06-05 9:42
 */
@Data
@Component
public class Config {
    @Value("${myConfig.name}")
    private String name;
    @Value("${myConfig.pwd}")
    private String pwd;
}
