package com.flowcontrol;

import java.util.Scanner;

public class IfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the value");
int num=sc.nextInt();
String result=(num%4==0)?"given number is leap":"given number is not leap";

	System.out.println(result);
	}

}
