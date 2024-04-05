package com.flowcontrol;

import java.util.Scanner;

public class SwitchEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please color code");
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		switch (choice) {
		case "R":
		case "r":
			System.out.println("red");
			break;
		case "B":
		case "b":
			System.out.println("Blue");
			break;
		case "G":
		case "g":
			System.out.println("Green");
			break;
		case "O":
		case "o":
			System.out.println("Orange");
			break;
		case "Y":
		case "y":
			System.out.println("Yellow");
			break;
		case "W":
		case "w":
			System.out.println("White");
			break;
		default:
			System.out.println("invalide code");
		}
	}

}
