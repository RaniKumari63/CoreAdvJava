package com.flowcontrol;

import java.util.Scanner;

public class SwitchEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First No:");
		int no1=sc.nextInt();
		System.out.println("Enter Second No:");
		int no2=sc.nextInt();
		System.out.println("Select Symbol(+,-,*,/)");
		String sym=sc.next();
		int res;
		switch(sym)
		{
		case "+": res=no1+no2;
		System.out.println("Addition is:"+res);
		break;
		case "-": res=no1-no2;
		System.out.println("Subtraction is:"+res);
		break;
		case "*": res=no1*no2;
		System.out.println("Multiplication is:"+res);
		break;
		case "/": res=no1/no2;
		System.out.println("Division is:"+res);
		break;
		default: System.out.println("Thank for using App");
		
		}
		}
	}

}
