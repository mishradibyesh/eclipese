package com.bl.tictoctoe.game;
import java.util.*;
import java.util.Scanner;
public class Tic_Toc_Toe {
	static char[] board =new char[10];       // declaring array board globally
	public static void main(String[] args) {
		board();                            //calling the method board in main method
		char letter = chooseLetter();
		if(letter=='X') {
			System.out.println("Player's letter is "+letter);
			System.out.println("computer's letter is O");
		}
		else if(letter == 'O') {
			System.out.println("Player's letter is "+letter);
			System.out.println("computer's letter is X");
		}
		else 
			System.out.println("Wrong selection");
	}
	// creating a board to play
	public static void board() 
	{
		// giving each array index value as empty initially
		for(int i=1;i < 10 ; i++) {
			board[i] =' ';
		}

	}
	public static char chooseLetter() {
		Scanner s = new Scanner(System.in);
		System.out.println("please  select X  or O ");
		char letter = s.next().charAt(0);
		return letter;
	}

}
