package com.lang2;

import java.util.Scanner;

public class Factorial {
public static void main(String[] args)
{   System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
int no=sc.nextInt();
	int num=factorial(no);
	System.out.println(num);
}
static int factorial(int n)
{  if(n>=1)
	return n*factorial(n-1);
else
	return 1;
}
}
