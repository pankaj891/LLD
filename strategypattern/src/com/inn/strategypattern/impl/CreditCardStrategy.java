package com.inn.strategypattern.impl;



public class CreditCardStrategy implements PaymentStrategy {

	String creditCardNumber;
	int cvv;
	String date;
	
	public CreditCardStrategy(String creditCardNumber,int cvv,String date) {
		this.creditCardNumber=creditCardNumber;
		this.cvv=cvv;
		this.date=date;
	}
	
	@Override
	public void pay(int payment) {
		// TODO Auto-generated method stub
		System.out.print("transferring by creditcard amount : "+payment+" successfull..");
	}

	@Override
	public Boolean validateCredential() {
		// TODO Auto-generated method stub
		if ("233456".equalsIgnoreCase(this.creditCardNumber) && 234 == this.cvv && "22".equalsIgnoreCase(this.date))
			return true;
		else
			return false;
	}

}
