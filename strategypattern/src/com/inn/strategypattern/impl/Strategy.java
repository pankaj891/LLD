package com.inn.strategypattern.impl;


public class Strategy {

	public static void main(String[] args) {
		PaymentStrategy payment = new PaypalStrategy("pankaj","pass@123");
		if (payment.validateCredential())
			payment.pay(345);
		payment = new CreditCardStrategy("233456",234,"22");
		if (payment.validateCredential())
			payment.pay(567);
	}
}
