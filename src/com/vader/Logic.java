package com.vader;

import java.util.Scanner;

import com.vader.units.Bot;
import com.vader.units.Player;

public class Logic {
	//Variables
	public static int cm = 0;
	public static Bot bot = new Bot();
	public static Player pl = new Player();
	
	//main void
	public static void move() {
		MakeMove();
	}
	
	//logic void
	public static void MakeMove() {
		System.out.println("Change move:\n1 - Rock\n2 - Paper\n3 - Scissors");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		cm = sc.nextInt();
		if(pl.CheckChangedMove(cm)=="error") move();
		else {
			System.out.println("Your move: "+pl.CheckChangedMove(cm));
			System.out.println("Bot move: "+bot.getmove());
		}
		CheckWinner();
	}
	public static String CheckWinner() {
		if(pl.CheckChangedMove(cm)=="Paper" && bot.getmove()=="Rock" || 
				pl.CheckChangedMove(cm)=="Scissors" && bot.getmove()=="Paper" ||
				pl.CheckChangedMove(cm)=="Rock" && bot.getmove()=="Scissors") return "You win!";
		if(pl.CheckChangedMove(cm)==bot.getmove()) return "No Winner!";
		else return "Bot win!";
	}
}
