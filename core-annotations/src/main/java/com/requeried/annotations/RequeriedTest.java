package com.requeried.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RequeriedTest {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/required/annotation/required-annotations.xml");
           Motor motor=context.getBean("motor", Motor.class);
           System.out.println(motor);
	}

}
