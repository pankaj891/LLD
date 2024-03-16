package com.inn.snakeladderlld.dice;

import java.util.Random;

public class Dice {
	
	private  Random rand = new Random();
	private static Dice dice = null;
	private int range;

	private Dice(int range) {
		this.range=range;
	}
	
	public static Dice getDice(int range) {
		if (Dice.dice==null) 
			Dice.dice=new Dice(range);		
		return Dice.dice
				;
	}
	
	public int getNumber() {
		return rand.nextInt(this.range)+1;
	}

}
