package com.iterate;

import java.util.Scanner;

public class For22 {
	int facnum=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter the number");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		For22 f=new For22();
		int ans=f.factorial(number);
		System.out.println(ans);
	}
int factorial(int no){
	if(no>0)
	{
		facnum=facnum*no;
	 factorial(no-1);
	}
	return facnum;
}
}
