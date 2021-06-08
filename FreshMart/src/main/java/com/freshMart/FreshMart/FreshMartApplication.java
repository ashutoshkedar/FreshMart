package com.freshMart.FreshMart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class FreshMartApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreshMartApplication.class, args);
	}
	
//	@Bean
//	public InternalResourceViewResolver getViewResolver() {
//		InternalResourceViewResolver rv = new InternalResourceViewResolver();
//		rv.setPrefix("/");
//		rv.setSuffix(".jsp");
//		return rv;
//	}
	
}
