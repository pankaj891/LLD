package com.inn.notifybutton;

public class Userone implements Observer {

	private Observable observable;
	
	public Userone(Observable observable) {
		this.observable = observable;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("data : "+observable.getData());
	}

}
