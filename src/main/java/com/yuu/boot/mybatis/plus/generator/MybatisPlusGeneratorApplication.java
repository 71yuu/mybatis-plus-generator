package com.yuu.boot.mybatis.plus.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.yuu.boot.mybatis.plus.generator.mp.mapper")
public class MybatisPlusGeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisPlusGeneratorApplication.class, args);
	}

}
