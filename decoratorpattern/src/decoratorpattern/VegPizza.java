package decoratorpattern;

public class VegPizza implements Pizza {

	@Override
	public void make() {
		System.out.println("Veg Pizza preparing");
	}

	@Override
	public void finish() {
		System.out.println("Veg Pizza Done");
	}

}
