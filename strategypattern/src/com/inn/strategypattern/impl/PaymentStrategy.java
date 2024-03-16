package com.inn.strategypattern.impl;

public interface PaymentStrategy {

	void pay(int payment);
	Boolean validateCredential();
}
