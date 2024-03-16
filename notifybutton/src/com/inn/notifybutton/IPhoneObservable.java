package com.inn.notifybutton;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservable implements Observable {
	
	List<Observer> listOfObservable = new ArrayList<Observer>();
	private String mydata = null;

	@Override
	public void add(Observer observer) {
		// TODO Auto-generated method stub	
		listOfObservable.add(observer);
	}

	@Override
	public void remove(Observer observer) {
		// TODO Auto-generated method stub
		listOfObservable.remove(listOfObservable.size()-1);
	}

	public void setdata(String data) {
		// TODO Auto-generated method stub
		this.mydata=data;
		notification();
	}

	
	private void notification() {
		// TODO Auto-generated method stub
		for (Observer obsever : listOfObservable) {
			obsever.update();
		}
	}

	@Override
	public String getData() {
		// TODO Auto-generated method stub
		return this.mydata;
	}

}