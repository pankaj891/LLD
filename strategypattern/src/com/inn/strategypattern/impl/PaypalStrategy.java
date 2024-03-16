package com.inn.strategypattern.impl;

import com.inn.strategypattern.PaymentStrategy;

public class PaypalStrategy implements PaymentStrategy {
	
	String email;
	String password;
	
	public PaypalStrategy(String email,String password) {
		this.email=email;
		this.password=password;
	}

	@Override
	public void pay(int payment) {
		System.out.println("transfer amount "+payment+" successfully...");
	}

	@Override
	public Boolean validateCredential() {
		if ("pankaj".equalsIgnoreCase(this.email) && "pass@123".equalsIgnoreCase(this.password))
			return true;
		else
			return false;
	}

}
