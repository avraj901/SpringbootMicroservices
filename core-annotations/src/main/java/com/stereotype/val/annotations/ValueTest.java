package com.stereotype.val.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ValueTest {

	public static void main(String[] args) {

		ApplicationContext context= new AnnotationConfigApplicationContext("com.stereotype.val.annotations");
           Book book=context.getBean("book", Book.class);
           System.out.println(book);
	}

}
