package com.requeried.annotations;

import org.springframework.beans.factory.annotation.Required;

public class Motor {

	private Fuel fuel;

	public Fuel getFuel() {
		return fuel;
	}
	 @Required
	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Motor [fuel=" + fuel + "]";
	}
	
	
}
