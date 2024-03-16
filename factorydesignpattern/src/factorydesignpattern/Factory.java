package factorydesignpattern;

public class Factory {

	public static void main(String[] args) {
		Computer server = ComputerFactory.getFactory("Server", "10", "20", "2");
		System.out.println("server : "+server);
		Computer pc = ComputerFactory.getFactory("PC", "20", "150", "6");
		System.out.println("PC : "+pc);
	}

}
