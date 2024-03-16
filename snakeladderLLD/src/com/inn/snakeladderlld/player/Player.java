package com.inn.snakeladderlld.player;

public class Player {
	
	private String name;
	public String getName() {
		return name;
	}

	private int pos;

	public Player(String name,int pos) {
		this.name=name;
		this.pos=pos;
	}
	
	public void setPosition(int pos) {
		this.pos=pos;
	}
	
	public int getPosition() {
		return this.pos;
	}
	
	public void move(int incr) {
		this.pos=this.pos+incr;
	}

}
