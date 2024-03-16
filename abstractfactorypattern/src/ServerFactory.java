
public class ServerFactory implements ComputerAbstractFactory {

	private String Ram;
	private String hdd;
	private String cpu;
	
	public ServerFactory(String Ram,String hdd,String cpu) {
		this.Ram=Ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	
	@Override
	public Computer createComputer() {
		return new Server(this.Ram,this.hdd,this.cpu);
	}

}
