package com.lp.mybatisecharts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.lp.*")
@SpringBootApplication
@MapperScan("com.lp.mapper")
public class MybatisEchartsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisEchartsApplication.class, args);
	}

}

