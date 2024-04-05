package com.flowcontrol;

import java.util.Scanner;

public class TernaryEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter yours number");
		
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		String result=(number>0)?"positive number":"negative number";
		System.out.println(result);
	}

}
