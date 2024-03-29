package com.inn.pizzabillingown.basepizza.impl;

import com.inn.pizzabillingown.basepizza.BasePizza;

public class DeluxePizza implements BasePizza {

	private int price;
	private String pizzaName;
	
	DeluxePizza(int price,String pizzaName) {
		this.price=price;
		this.pizzaName=pizzaName;
	}
	
	@Override
	public int getAmount() {
		// TODO Auto-generated method stub
		return this.price;
	}
	@Override
	public StringBuilder getPizzaName() {
		// TODO Auto-generated method stub
		return new StringBuilder(this.pizzaName);
	}

	@Override
	public String toString() {
		return "DeluxePizza [price=" + price + ", pizzaName=" + pizzaName + "]";
	}

}
