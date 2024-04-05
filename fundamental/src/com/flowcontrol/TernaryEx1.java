package com.flowcontrol;

import java.util.Scanner;

public class TernaryEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		System.out.println("enter yours marks");
		double marks=input.nextDouble();
		String result=(marks>40)?"pass":"fail";
		System.out.println("you"+result+"the exam");
		input.close();
	}

}
