package com.lang2;

import java.util.Scanner;

public class Numbers3 {


		// TODO Auto-generated method stub
		public static void main(String[] args)
		{   System.out.println("enter the number");
			Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
			number(no);
			
		}
		static void number(int n)
		{  if(n>=1)
			{System.out.print(n+"\t");
		      number(n-1);
			}
		}
	}


