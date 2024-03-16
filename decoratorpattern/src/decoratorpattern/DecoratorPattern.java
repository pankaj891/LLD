package decoratorpattern;

public class DecoratorPattern {

	public static void main(String[] args) {
		Pizza dinnerForPankaj = new PistaDecorator(new ChesseDecorator(new VegPizza()));
		dinnerForPankaj.make();
		dinnerForPankaj.finish();
		Pizza dinnerForAnamika = new ChesseDecorator(new VegPizza());
		dinnerForAnamika.make();
		dinnerForAnamika.finish();
	}

}
