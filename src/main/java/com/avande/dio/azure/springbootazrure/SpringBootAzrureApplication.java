package com.avande.dio.azure.springbootazrure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;


@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
@SpringBootApplication
public class SpringBootAzrureApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAzrureApplication.class, args);
	}

}
