package com.iterate;

import java.util.Scanner;

public class ForEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 2; ++i) // rows
		{
			for (int j = 0; j < 6; ++j) // columns
			{
				System.out.print("A");
			}
			System.out.println();

		}

		for (int i1 = 0; i1 < 5; ++i1) // rows
		{
			for (int j1 = 0; j1 < 5; ++j1) // columns
			{
				System.out.print("1");
			}
			System.out.println();
		}

		int k = 1;
		for (int i2 = 0; i2 < 10; ++i2) // rows
		{
			for (int j2 = 0; j2 < 5; ++j2) // columns 
				{
				System.out.print(k);
			++k;
		}
		System.out.println();

	}

	int k1 = 2;
	for(int i3 = 0;i3<10;++i3) // rows
	{
		for (int j3 = 0; j3 < 5; ++j3) // columns
		{
			System.out.print(k1);
			k1 = k1 + 2;
		}
		System.out.println();

	}

	int k2 = 0;
	for(int i4 = 0;i4<10;++i4) // rows
	{
		for (int j4 = 0; j4< 5; ++j4) // columns
		{
			System.out.print(k2+" ");
			k2 = k2 + 5;
		}
		System.out.println();

	}
	

}

}
