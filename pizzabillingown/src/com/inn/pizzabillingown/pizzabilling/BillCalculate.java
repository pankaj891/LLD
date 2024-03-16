package com.inn.pizzabillingown.pizzabilling;

import com.inn.pizzabillingown.pizzabilling.model.Bill;
import com.inn.pizzabillingown.pizzasize.PizzaSize;

public interface BillCalculate {
	public Bill calculate(PizzaSize pizzaSize);
}
