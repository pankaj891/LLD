package builderdesignpattern;

public class Computer {

	// required parameters
	private String HDD;
	private String RAM;

	// optional parameters
	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;
	public String getHDD() {
		return HDD;
	}
	
	public String getRAM() {
		return RAM;
	}
	
	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}
	
	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}
	
	private Computer(ComputerBuilder builder) {
		this.HDD=builder.HDD;
		this.RAM=builder.RAM;
		this.isGraphicsCardEnabled=false;
		this.isBluetoothEnabled=false;
	}
	
	public static class ComputerBuilder {
		// required parameters
		private String HDD;
		private String RAM;

		// optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String hdd, String ram){
			this.HDD=hdd;
			this.RAM=ram;
		}
		
		public ComputerBuilder setIsGraphicsCardEnabled(boolean isgraphics) {
			this.isGraphicsCardEnabled=isgraphics;
			return this;
		}
		
		public ComputerBuilder setIsBluetoothEnabled(boolean isbluetooth) {
			this.isBluetoothEnabled=isbluetooth;
			return this;
		}
		
		public Computer build(){
			return new Computer(this);
		}
	}

}
