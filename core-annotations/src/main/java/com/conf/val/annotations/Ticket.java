package com.conf.val.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ticket {

	private int ticketno;
	private String name;
	private String source;
	private String destination;
	private double amount;
	public int getTicketno() {
		return ticketno;
	}
	@Value("101")
	public void setTicketno(int ticketno) {
		this.ticketno = ticketno;
	}
	public String getName() {
		return name;
	}
	@Value("avanish")
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	@Value("hyderabad")
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	@Value("Banglore")
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getAmount() {
		return amount;
	}
	@Value("1000.9")
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Ticket [ticketno=" + ticketno + ", name=" + name + ", source=" + source + ", destination=" + destination
				+ ", amount=" + amount + "]";
	}
	
	
}
