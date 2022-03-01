package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ProyectoSpringBootMvcApplication extends SpringBootServletInitializer {
	

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
				return builder.sources(ProyectoSpringBootMvcApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(ProyectoSpringBootMvcApplication.class, args);
	}

}
