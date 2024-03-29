package com.inn.pizzabillingown.pizzabilling.impl;

import com.inn.pizzabillingown.basepizza.BasePizza;
import com.inn.pizzabillingown.pizzabilling.BillCalculate;
import com.inn.pizzabillingown.pizzabilling.model.Bill;
import com.inn.pizzabillingown.pizzasize.PizzaSize;

public class NormalDayBillCalculate implements BillCalculate {

	private BasePizza pizza;
	
	public NormalDayBillCalculate(BasePizza pizza) {
		this.pizza=pizza;
	}
	
	@Override
	public Bill calculate(PizzaSize pizzaSize) {
		switch (pizzaSize.name()) {
		case "SMALL":
			return new Bill(pizza.getAmount()*1,pizza.getPizzaName().toString());
		case "MEDIUM":
			return new Bill(pizza.getAmount()*2,pizza.getPizzaName().toString());
		case "LARGE":
			return new Bill(pizza.getAmount()*3,pizza.getPizzaName().toString());
		case "EXTRA_LARGE":
			return new Bill(pizza.getAmount()*4,pizza.getPizzaName().toString());
		default:
			return new Bill(0,"");
		}
	}

	@Override
	public String toString() {
		return "NormalDayBillCalculate [pizza=" + pizza + "]";
	}

}
