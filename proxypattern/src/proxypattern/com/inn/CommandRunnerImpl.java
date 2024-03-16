package proxypattern.com.inn;

class CommandRunnerImpl implements CommandRunner {

	@Override
	public void run(String cmnd) {
		System.out.println("==> : "+cmnd);
	}

}
