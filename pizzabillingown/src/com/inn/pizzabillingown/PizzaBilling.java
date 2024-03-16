package com.inn.pizzabillingown;

import com.inn.pizzabillingown.basepizza.BasePizza;
import com.inn.pizzabillingown.basepizza.impl.RegularPizza;
import com.inn.pizzabillingown.pizzabilling.BillCalculate;
import com.inn.pizzabillingown.pizzabilling.impl.NormalDayBillCalculate;
import com.inn.pizzabillingown.pizzabilling.model.Bill;
import com.inn.pizzabillingown.pizzasize.PizzaSize;
import com.inn.pizzabillingown.toppings.impl.Cheese;
import com.inn.pizzabillingown.toppings.impl.Mushrooms;

public class PizzaBilling {

	public static void main(String[] args) {
		BasePizza pizza = new Cheese(new Mushrooms(new RegularPizza(100,"Regular"),30,"mushroom"),40,"Cheese");
		BillCalculate billCalculate = new NormalDayBillCalculate(pizza);
		Bill calculate = billCalculate.calculate(PizzaSize.MEDIUM);
		System.out.println("pizza bill  : "+calculate);
	}

}
