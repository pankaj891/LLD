package decoratorpattern;

public class NonvegPizza implements Pizza {

	@Override
	public void make() {
		System.out.println("Non-Veg Pizza preparing");
	}

	@Override
	public void finish() {
		System.out.println("Non-Veg Pizza Done");
	}


}
