package decoratorpattern;

public class ChesseDecorator extends PizzaDecorator{

	ChesseDecorator(Pizza pizza) {
		super(pizza);
	}

	@Override
	public void make() {
		super.make();
		super.finish();
		System.out.println("Adding Chesse...");
	}

	@Override
	public void finish() {
		System.out.println("Adding Chesse Done");
	}

}
