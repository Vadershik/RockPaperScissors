package com.vader.units;

import java.util.Random;

public class Bot {
	public Random rn = new Random();
	public int res = rn.nextInt(2);
	public int genmove() {
		return res;
	}
	public String getmove() {
		return (res==0) ? "Rock" : (res==1) ? "Paper" : "Scissors";
	}
}
