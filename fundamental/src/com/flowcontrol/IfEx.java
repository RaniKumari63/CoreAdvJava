package com.flowcontrol;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
if(num>0)
	System.out.println("positive number");
else if(num<0)
	System.out.println("negative number");
else 
{
	System.out.println("zero");
}





	

	}

}
