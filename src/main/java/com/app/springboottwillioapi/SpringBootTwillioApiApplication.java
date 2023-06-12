package com.app.springboottwillioapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootTwillioApiApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootTwillioApiApplication.class, args);
		
	}

}
