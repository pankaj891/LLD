package decoratorpattern;

public class PistaDecorator extends PizzaDecorator{

	PistaDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	public void make() {
		super.make();
		super.finish();
		System.out.println("Adding Pista...");
	}

	@Override
	public void finish() {
		System.out.println("Adding Pista Done");
	}

}
