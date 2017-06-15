package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.config.BookConfig;
import com.model.Book;

public class BookTest {
private static ApplicationContext context;

public static void main(String[] args){
	context = new AnnotationConfigApplicationContext(BookConfig.class);
	Book book = (Book)context.getBean(Book.class);
	book.setId(23);
	book.setName("java");
	book.setAuthor("selva");
	System.out.println(book);
    ((AbstractApplicationContext) context).close();	
}
}
