package com.inn.snakeladderlld.enemies;

public abstract class Enemies {

	private int start;
	private int end;
	
	protected Enemies(int start,int end) {
		this.start=start;
		this.end=end;
	}
	
	public int getStart() {
		return this.start;
	}
	
	public int getEnd() {
		return this.end;
	}

	@Override
	public String toString() {
		return "Enemies [start=" + start + ", end=" + end + "]";
	}

}
