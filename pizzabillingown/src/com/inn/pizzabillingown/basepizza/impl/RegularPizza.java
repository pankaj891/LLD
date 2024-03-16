package com.inn.pizzabillingown.basepizza.impl;

import com.inn.pizzabillingown.basepizza.BasePizza;

public class RegularPizza implements BasePizza {

	private int price;
	private String pizzaName;

	public RegularPizza(int price,String pizzaName) {
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
		return "RegularPizza [price=" + price + ", pizzaName=" + pizzaName + "]";
	}

}
