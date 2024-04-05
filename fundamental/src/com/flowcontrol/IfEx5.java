package com.flowcontrol;

import java.util.Scanner;


public class IfEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		if(number>0)
		{
			System.out.println("positive number");
		}
		else
		{
			System.out.println("negative number");
		}
	}

}
