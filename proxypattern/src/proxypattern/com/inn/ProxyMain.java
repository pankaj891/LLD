package proxypattern.com.inn;

public class ProxyMain {

	public static void main(String[] args) {
		ProxyCommand myproxy = new ProxyCommand("pankaj");
		myproxy.run("ls");
		ProxyCommand myproxyone = new ProxyCommand("pankajddj");
		myproxyone.run("ls");
	}
}
