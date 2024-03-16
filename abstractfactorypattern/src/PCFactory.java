
public class PCFactory implements ComputerAbstractFactory {

	private String Ram;
	private String hdd;
	private String cpu;
	
	public PCFactory(String Ram,String hdd,String cpu) {
		this.Ram=Ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	
	@Override
	public Computer createComputer() {
		return new PC(this.Ram,this.hdd,this.cpu);
	}

}
