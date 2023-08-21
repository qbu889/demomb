package com.example.demomb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan(basePackages = "com.example.demomb.mapper")
public class DemombApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemombApplication.class, args);
	}

}
