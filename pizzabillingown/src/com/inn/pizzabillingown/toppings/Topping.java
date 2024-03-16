package com.inn.pizzabillingown.toppings;

import com.inn.pizzabillingown.basepizza.BasePizza;

public abstract class Topping implements BasePizza {

	private BasePizza pizza;

	public Topping(BasePizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public int getAmount() {
		return this.pizza.getAmount();
	}

	@Override
	public StringBuilder getPizzaName() {
		return this.pizza.getPizzaName();
	}
}
