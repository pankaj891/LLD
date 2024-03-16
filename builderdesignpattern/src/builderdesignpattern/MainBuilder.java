package builderdesignpattern;

public class MainBuilder {

	public static void main(String[] args) {
		Computer comp = new Computer.ComputerBuilder("1tb", "16gb").setIsBluetoothEnabled(false).setIsGraphicsCardEnabled(true).build();
	}
	
}
