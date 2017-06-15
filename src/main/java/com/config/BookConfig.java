package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.Book;

@Configuration
public class BookConfig {
	@Bean(initMethod="init",destroyMethod="destroy")

	public Book book(){
		return new Book();
    	
	}
}
