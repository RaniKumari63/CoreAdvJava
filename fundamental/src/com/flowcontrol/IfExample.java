package com.flowcontrol;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int age=15;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value");
int age=sc.nextInt();
if(age>18)
	
	{System.out.println("he/she is major");
	}
	
else
{
	System.out.println("he/she is minor");
	}

}
}
