package com.autowire.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Motor {

	@Autowired
	private MicroController microController;
	@Autowired
	private Curcuit curcuit;
	@Override
	public String toString() {
		return "Motor [microController=" + microController + ", curcuit=" + curcuit + "]";
	}
	
	
}
