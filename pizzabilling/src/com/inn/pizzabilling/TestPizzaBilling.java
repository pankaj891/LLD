package com.inn.pizzabilling;

import com.inn.pizzabilling.pizza.Pizza;
import com.inn.pizzabilling.pizza.impl.VegPizza;
import com.inn.pizzabilling.pizza.type.PizzaType;

public class TestPizzaBilling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pizza vegPizza = new VegPizza(150,PizzaType.MEDIUM);
		System.out.println("Pizza : "+vegPizza.pizzaType);
		System.out.println("Pizza pieces : "+vegPizza.getPizzaPiece());
		System.out.println("Pizza price : "+vegPizza.getPrice());
	}

}
