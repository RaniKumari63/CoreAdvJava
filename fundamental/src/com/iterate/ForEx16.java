package com.iterate;

import java.util.Scanner;

public class ForEx16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("please enter the number");
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();
int remainder=0;
int reverse=0;
while(number!=0)
{
	remainder=number%10; 
	reverse=reverse*10+remainder;
		number=number/10;
	
	
}
System.out.println("the reverse of a number"+reverse);
	}

}
