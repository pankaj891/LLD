package com.inn.pizzabilling.pizza.impl;

import com.inn.pizzabilling.pizza.Pizza;
import com.inn.pizzabilling.pizza.type.PizzaType;

public class VegPizza extends Pizza {

	public VegPizza(int pizzaPrice, PizzaType pizzaType) {
		super(pizzaPrice, pizzaType);
	}

	public int getPrice() {
		return this.pizzaPrice;
	}

	public int getPizzaPiece() {
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

	public PizzaType getPizzaType() {
		return this.pizzaType;
	}
}
