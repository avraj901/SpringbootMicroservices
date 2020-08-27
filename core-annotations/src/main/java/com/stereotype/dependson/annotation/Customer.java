package com.stereotype.dependson.annotation;

import org.springframework.stereotype.Component;

@Component
public class Customer {

	public Customer() {
	
		System.out.println("customer()");
	}

	
}
