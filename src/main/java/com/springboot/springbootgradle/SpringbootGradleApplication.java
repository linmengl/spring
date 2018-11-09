package com.springboot.springbootgradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springboot.springbootgradle")
public class SpringbootGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootGradleApplication.class, args);
	}
}
