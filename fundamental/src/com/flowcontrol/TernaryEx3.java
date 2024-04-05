package com.flowcontrol;

import java.util.Scanner;

public class TernaryEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter yours number1");
		
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
System.out.println("enter yours number2");
		
		Scanner sc2=new Scanner(System.in);
		int n2=sc2.nextInt();
System.out.println("enter yours number3");
		
		Scanner sc3=new Scanner(System.in);
		int n3=sc3.nextInt();
		
		int largest=(n1>=n2)?((n1>=n3)?n1:n3):((n2>=n3)?n2:n3);
		System.out.println(largest);
	}

}
