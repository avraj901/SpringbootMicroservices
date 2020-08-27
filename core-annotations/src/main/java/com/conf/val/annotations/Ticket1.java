package com.conf.val.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ticket1 {
	@Value("#{appProps.Ticket_ticketno}")
	private int ticketno;
	@Value("#{appProps.Ticket_name}")
	private String name;
	@Value("#{appProps.Ticket_source}")
	private String source;
	@Value("#{appProps.Ticket_destination}")
	private String destination;
	@Value("#{appProps.Ticket_amount}")
	private double amount;

	public int getTicketno() {
		return ticketno;
	}

	public void setTicketno(int ticketno) {
		this.ticketno = ticketno;
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Ticket1 [ticketno=" + ticketno + ", name=" + name + ", source=" + source + ", destination="
				+ destination + ", amount=" + amount + "]";
	}

}
