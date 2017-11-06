package org.levvel.poc;

import java.util.Date;

public class User{

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public User(String from, String to, String amount, String when) {
		this.from = from;
		this.to = to;
		this.amount = amount;
		this.when = when;
	}

	@Override
	public String toString() {
		return "User{" +
				"from='" + from + '\'' +
				", to='" + to + '\'' +
				", amount='" + amount + '\'' +
				", when='" + when + '\'' +
				'}';
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getWhen() {
		return when;
	}

	public void setWhen(String when) {
		this.when = when;
	}

	private String from;
	private String to;
	private String amount;
	private String when;
	

	
}