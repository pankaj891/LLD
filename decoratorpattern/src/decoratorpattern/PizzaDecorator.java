package decoratorpattern;

public abstract class PizzaDecorator implements Pizza {

	protected Pizza pizza;
	
	PizzaDecorator(Pizza pizza) {
		this.pizza=pizza;
	}
	
	@Override
	public void make() {
		this.pizza.make();
	}

	@Override
	public void finish() {
		this.pizza.finish();
	}

}
