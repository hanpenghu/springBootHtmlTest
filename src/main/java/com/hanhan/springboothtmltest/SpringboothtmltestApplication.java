package com.hanhan.springboothtmltest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hanhan.springboothtmltest.DDao")
public class SpringboothtmltestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboothtmltestApplication.class, args);
	}
}
