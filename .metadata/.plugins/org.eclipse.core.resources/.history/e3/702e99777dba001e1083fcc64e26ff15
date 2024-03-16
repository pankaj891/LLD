package factorydesignpattern;

public class ComputerFactory {

	public static Computer getFactory(String computerType,String ram,String hdd,String cpu) {
		if ("PC".equalsIgnoreCase(computerType))
			return new PC(ram,hdd,cpu);
		else if ("Server".equalsIgnoreCase(computerType))
			return new Server(ram,hdd,cpu);
		return null;
	}
}
