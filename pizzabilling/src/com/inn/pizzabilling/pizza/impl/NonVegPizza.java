package com.inn.pizzabilling.pizza.impl;

import com.inn.pizzabilling.pizza.Pizza;
import com.inn.pizzabilling.pizza.type.PizzaType;

public class NonVegPizza extends Pizza {

	public NonVegPizza(int pizzaPrice, PizzaType pizzaType) {
		super(pizzaPrice, pizzaType);
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return this.pizzaPrice;
	}

	@Override
	public int getPizzaPiece() {
		// TODO Auto-generated method stub
		switch (this.pizzaType) {
		case SMALL:
			return 4;
		case MEDIUM:
			return 6;
		case LARGE:
			return 8;
		}
		return 0;
	}

	@Override
	public PizzaType getPizzaType() {
		// TODO Auto-generated method stub
		return this.pizzaType;
	}

}
