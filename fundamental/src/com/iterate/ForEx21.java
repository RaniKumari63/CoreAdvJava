package com.iterate;

import java.util.Scanner;

public class ForEx21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int facnum=1;
		for(int i=1;i<=number;i++)
		{
			facnum=facnum*i;
		}
		System.out.println(facnum);
	}

}
