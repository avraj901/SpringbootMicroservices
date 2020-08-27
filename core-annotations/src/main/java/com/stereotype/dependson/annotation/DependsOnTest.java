package com.stereotype.dependson.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependsOnTest {

	public static void main(String[] args) {
		/*
		 * ApplicationContext context = new ClassPathXmlApplicationContext(
		 * "com/stereotype/dependson/annotation/dependson-config.xml");
		 */
		ApplicationContext context=new AnnotationConfigApplicationContext("com.stereotype.dependson.annotation");
	}
}
