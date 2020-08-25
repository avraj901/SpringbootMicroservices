package com.autowire.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireTest {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/autowire/annotation/autowire-annotations.xml");
	      Motor motor=context.getBean("motor", Motor.class);
	      System.out.println(motor);
	}
}
