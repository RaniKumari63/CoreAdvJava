package com.abstract10;

import javax.xml.stream.events.Characters;

public class TicTacToe {
	char[][] board;
	int turns;

	TicTacToe() {
		board = new char[3][3];
		turns = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = Characters.SPACE;

			}
		}
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				System.out.println(board[i][j]);
			}
		}
	}

	int flag = 0;
	int flag1 = 0;
	boolean value;
	int full;
int turns1;
	boolean isWinner(char p) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				full++;
				if ((board[i][j] == p)) {
					flag++;
					break;

				}
				if (board[i][j] != Characters.SPACE) {
					flag1++;
				}

			}

		}

		if ((flag == 3) && (p == 'X') || (p == 'x')) {
			value = true;
		} else if ((flag == 3) && (p == 'O') || (p == 'o')) {
			value = true;
		}

		return value;
	}

	boolean isFull() {
		if (full == 9) {
			return true;

		} else {
			return false;
		}
	}

	boolean isCat() {
		if ((flag1 == 9) && ((isWinner('X') != true) || ((isWinner('x')) != true) || (isWinner('o') != true)
				|| (isWinner('O')) != true))

			return true;
		else
			return false;
	}

	boolean isValid(int r, int c) {
		if (r < 3 && c < 3)
			return true;
		else
			return false;

	}
	
	int numTurns()
	{
		
		return full;
		
	}
	char playerAt(int r,int c)
	{
		 char charatindex=board[r][c];
		 return charatindex;
	}
	void displayBoard()
	{
		for(int i=0;i<board.length;i++)
		{
			for(int j=0;j<board.length;j++)
			{
				System.out.println(board[i][j]);
			}
		}
	}
	
	void playMove(char p,int r,int c)
	{
		board[r][c]=p;
	}
}
