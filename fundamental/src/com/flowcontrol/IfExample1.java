package com.flowcontrol;

import java.util.Scanner;

public class IfExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int num=sc.nextInt();
		if(num%4==0)
		{
			System.out.println("leap");
		}
		else
		{
			System.out.println("not leap");
		}
	}

}
