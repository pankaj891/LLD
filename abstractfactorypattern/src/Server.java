

public class Server extends Computer {

	private String Ram;
	private String hdd;
	private String cpu;
	
	
	
	public Server(String ram, String hdd, String cpu) {
		this.Ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	String getRAM() {
		// TODO Auto-generated method stub
		return this.Ram;
	}

	@Override
	String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

}
