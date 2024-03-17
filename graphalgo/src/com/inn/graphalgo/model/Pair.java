package com.inn.graphalgo.model;

public class Pair {

	private int v;
	private int wieght = -1;
	
	public Pair(int v,int weight) {
		this.v=v;
		this.wieght=weight;
	}

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "Pair [v=" + v + ", wieght=" + wieght + "]";
	}

	public int getWieght() {
		return wieght;
	}

	public void setWieght(int wieght) {
		this.wieght = wieght;
	}

}
