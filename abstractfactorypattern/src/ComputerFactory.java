

public class ComputerFactory {

	public static Computer getFactory(ComputerAbstractFactory computerAbstractFactory) {
		return computerAbstractFactory.createComputer();
	}
}
