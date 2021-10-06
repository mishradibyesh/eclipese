package com.bl.tictoctoe.game;
public class Tic_Toc_Toe {
	static char[] board =new char[10];// declaring array board globally
	public static void main(String[] args) {		board();//calling the method board in main method
	}
	// creating a board to play
	public static void board() 
	{
		// giving each array index value as empty initiall		for(int i=1;i<=10;i++) {
		board[i]=' ';
	}
}

}
