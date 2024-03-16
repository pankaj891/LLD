package proxypattern.com.inn;

public class ProxyCommand implements CommandRunner {

	private CommandRunner proxy = new CommandRunnerImpl();
	private String userName;
	
	public ProxyCommand(String userName) {
		this.userName=userName;
	}

	@Override
	public void run(String cmnd) {
			if (this.userName.equals("pankaj"))
				proxy.run(cmnd);
			else
				System.out.println("invalid user");
	}

}
