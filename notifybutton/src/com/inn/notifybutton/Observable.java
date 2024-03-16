package com.inn.notifybutton;

public interface Observable {
	void add(Observer observer);
	void remove(Observer observer);
	void setdata(String data);
	String getData();
}
