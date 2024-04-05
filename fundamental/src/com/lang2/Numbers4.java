package com.lang2;

import java.util.Scanner;

public class Numbers4 {


		// TODO Auto-generated method stub
		public static void main(String[] args)
		{   System.out.println("enter the starting number");
			Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		System.out.println("enter ending number");
		int no2=sc.nextInt();
			number(no,no2);
			
		}
		static void number(int n,int i)
		{  if(n<=i)
			{  
			System.out.print(n+"\t");
			
		      number(++n,i);
			}
		}
	}


