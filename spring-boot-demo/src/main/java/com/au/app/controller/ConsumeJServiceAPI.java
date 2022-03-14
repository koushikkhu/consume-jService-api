package com.au.app.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.au.app.service.CategoryService;
import com.au.app.service.CategoryServiceImpl;
import com.au.app.service.ClueService;
import com.au.app.service.ClueServiceImpl;

@SpringBootApplication
public class ConsumeJServiceAPI extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ConsumeJServiceAPI.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ConsumeJServiceAPI.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate( ) {
		return new RestTemplate();
	}
	
	@Bean
	public ClueService getClueService( ) {
		return new ClueServiceImpl();
	}
	
	@Bean
	public CategoryService getCategoryService( ) {
		return new CategoryServiceImpl();
	}
}