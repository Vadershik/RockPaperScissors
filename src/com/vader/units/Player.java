package com.vader.units;

import java.util.Scanner;
import com.vader.units.Bot;

public class Player {
	public static int cm = 0;
	public String CheckChangedMove(int cm) {
		return (cm==1) ? "Rock" : (cm==2) ? "Paper" : (cm==3) ? "Scissors" : "error";
	}
}
