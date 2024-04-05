package com.langassign;

import java.util.Scanner;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first String");
		a=s.nextLine();
		System.out.println("Enter Second String");
		b=s.nextLine();
		
		StringEx obj= new StringEx();
		c=obj.concat(a, b);
		System.out.println("new string"+c);
		
	}
	String concat(String x,String y)
	{
		String z;
		z=x+" "+y;
		return z;
	}

}
