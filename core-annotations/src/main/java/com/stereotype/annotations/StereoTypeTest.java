package com.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoTypeTest {

	public static void main(String[] args) {

		
		/*
		 * ApplicationContext context=new ClassPathXmlApplicationContext(
		 * "com/stereotype/annotations/stereotype-beans.xml");
		 */
		
		ApplicationContext context= new AnnotationConfigApplicationContext(Toy.class);
		Toy toy=context.getBean("toy", Toy.class);
		toy.play();
	}

}
