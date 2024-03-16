package com.inn.pizzabilling.pizza;

import com.inn.pizzabilling.pizza.type.PizzaType;

public abstract class Pizza {
	
	//price
	public int pizzaPrice;
	//pizza type
	public PizzaType pizzaType;
	
	public Pizza(int pizzaPrice, PizzaType pizzaType) {
		this.pizzaPrice = pizzaPrice;
		this.pizzaType = pizzaType;
	}
	
	public abstract int getPrice();
	public abstract int getPizzaPiece();
	public abstract PizzaType getPizzaType();
}
