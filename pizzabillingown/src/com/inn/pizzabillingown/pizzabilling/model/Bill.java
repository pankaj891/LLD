package com.inn.pizzabillingown.pizzabilling.model;

public class Bill {
	int totalAmount;
	String pizzaName;

	public Bill(int totalAmount, String pizzaName) {
		this.totalAmount = totalAmount;
		this.pizzaName = pizzaName;
	}

	@Override
	public String toString() {
		return "Bill [totalAmount=" + totalAmount + ", pizzaName=" + pizzaName + "]";
	}
	
	
}
