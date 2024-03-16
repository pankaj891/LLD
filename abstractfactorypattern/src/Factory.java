

public class Factory {

	public static void main(String[] args) {
		ComputerAbstractFactory serverFactory = new ServerFactory("23gb","1tb","2core");
		Computer factory = ComputerFactory.getFactory(serverFactory);
		System.out.println("==> "+factory.toString());
		ComputerAbstractFactory pcFactory = new PCFactory("23gb","1tb","2core");
		Computer mypcfactory = ComputerFactory.getFactory(pcFactory);
		System.out.println("==> "+mypcfactory.toString());
	}

}
