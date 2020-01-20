package com.qiuweiping.microservices.socialmultiplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value="com.qiuweiping")
public class SocialMultiplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SocialMultiplicationApplication.class, args);
	}

}
