package com.myorg.admin.springbootAdmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
@Configuration
@EnableAutoConfiguration
public class SpringbootAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAdminApplication.class, args);
	}

}

