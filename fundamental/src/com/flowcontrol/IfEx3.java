package com.flowcontrol;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the value");
int num=sc.nextInt();

if(age>18)
{
	System.out.println("enter the value");
	int weight=sc.nextInt();
	if(weight>45)
	{
		System.out.println("he/she can given the blood");
	}
	
}
else
{
	System.out.println("she is minor");
}
	}

}
