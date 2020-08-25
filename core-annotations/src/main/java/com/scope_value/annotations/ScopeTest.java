package com.scope_value.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeTest {

	public static void main(String[] args) {

		ApplicationContext context=new AnnotationConfigApplicationContext(Ticket.class);
		Ticket ticket1=context.getBean("ticket", Ticket.class);
		Ticket ticket2=context.getBean("ticket", Ticket.class);
		System.out.println("ticket == ticket2 ? :" + (ticket1== ticket2));
		System.out.println(ticket1);
	}

}
