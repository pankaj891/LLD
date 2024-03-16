package singletonpattern;

import java.io.Serializable;

public class Computer implements Serializable{
	
	private static final long serialVersionUID = 1L;
	static Computer computer;
	
	private Computer() {}
	
	public static Computer getInstance() {
		if (computer==null) {
			synchronized (Computer.class) {
				if (computer==null) {
					computer = new Computer();
				}
			}
		}
		return computer;
	}
	
	protected Object readResolve() {
		return getInstance();
	}

}