package com.arrays;

import java.util.Scanner;

public class ArrayEx4 {
public static void main (String[] args)
{
	Scanner sc=new Scanner(System.in);
	int ar[][]=new int[3][4];
	ar[0]=new int[3];
	ar[1]=new int[2];
	ar[2]=new int[1];
	for(int i=0;i<ar.length;++i)
	{
		for(int j=0;j<ar[i].length;++j)
		{
			System.out.print(ar[i][j]);
		}
		System.out.println();
	}
}
}
