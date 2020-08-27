package com.conf.val.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ValueTest {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/conf/val/annotations/value-beans.xml");
		/* Ticket ticket=context.getBean("ticket", Ticket.class); */
		Ticket1 ticket=context.getBean("ticket1",Ticket1.class);
           System.out.println(ticket);
	}

}
