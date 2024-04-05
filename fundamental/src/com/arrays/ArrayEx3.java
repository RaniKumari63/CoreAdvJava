package com.arrays;

import java.util.Scanner;

public class ArrayEx3 {
public static void main (String[] args)
{
	Scanner sc=new Scanner(System.in);
	int ar[][]=new int[3][4];
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<4;++j)
		{
			System.out.print(ar[i][j]+"");
		}
		System.out.println();
	}
	int ar1[][]=new int[3][4];
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<4;++j)
		{
ar1[i][j]=sc.nextInt();
		}
		System.out.println();
	}
	for(int i=0;i<3;i++)
	{int sum=0;
		for(int j=0;j<4;++j)
		{
			System.out.print(ar1[i][j]+"");
			sum+=ar1[i][j];
		}
		System.out.println("="+sum);
		System.out.println();
	}
}
}
