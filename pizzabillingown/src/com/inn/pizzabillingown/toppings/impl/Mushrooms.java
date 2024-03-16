package com.inn.pizzabillingown.toppings.impl;

import com.inn.pizzabillingown.basepizza.BasePizza;
import com.inn.pizzabillingown.toppings.Topping;

public class Mushrooms extends Topping{

	private int price;
	private String pizzaName;
	
	public Mushrooms(BasePizza pizza,int price,String pizzaName) {
		super(pizza);
		this.price=price;
		this.pizzaName=pizzaName;
	}
	
	@Override
	public int getAmount() {
		return super.getAmount()+this.price;
	}

	@Override
	public StringBuilder getPizzaName() {
		return super.getPizzaName().append(",").append(this.pizzaName);
	}

	@Override
	public String toString() {
		return "Mushrooms [price=" + price + ", pizzaName=" + pizzaName + "]";
	}

}
