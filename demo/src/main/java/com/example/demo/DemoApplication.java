package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = DemoApplication.mapperScan)
public class DemoApplication {
	static final String mapperScan = "com.example.demo.*.mapper";

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
