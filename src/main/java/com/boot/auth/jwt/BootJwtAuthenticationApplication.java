package com.boot.auth.jwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.authentication.configuration.EnableGlobalAuthentication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;


@SpringBootApplication
public class BootJwtAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootJwtAuthenticationApplication.class, args);
	}

}
