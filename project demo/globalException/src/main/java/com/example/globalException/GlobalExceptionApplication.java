package com.example.globalException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.example.globalException.*"})
public class GlobalExceptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(GlobalExceptionApplication.class, args);
	}

}
