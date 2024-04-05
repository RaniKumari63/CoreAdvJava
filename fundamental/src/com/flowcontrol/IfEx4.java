package com.flowcontrol;

import java.util.Scanner;

public class IfEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter the age");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		//System.out.println("enter the weight");
		Scanner sc1=new Scanner(System.in);
		//int weight=sc1.nextInt();
		
		String msg=(age>18)?(sc1.nextInt()>45)? "donate blood":"no blood":"he/she underage";

	System.out.println(msg);
	}

}
