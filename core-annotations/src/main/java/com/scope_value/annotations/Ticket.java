package com.scope_value.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ticket")
@Scope("prototype")
public class Ticket {
    @Value("101")
	private int ticketNumber;
    @Value("avanish")
	private String name;
    @Value("azamgarh")
	private String source;
    @Value("Hyderabad")
	private String destination;
    @Value("600")
	private float amount;
	public int getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Ticket [ticketNumber=" + ticketNumber + ", name=" + name + ", source=" + source + ", destination="
				+ destination + ", amount=" + amount + "]";
	}
	
	
}
