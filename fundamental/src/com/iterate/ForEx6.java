package com.iterate;

import java.util.Scanner;

public class ForEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 1 1 2 3 5 8 13 21 34 55 89

		/*
		 * first=0 second=1 third=0 current =prev+beprev 1=0+1 current=prev+beprev 1+1
		 * current=prev+beprev
		 */
		System.out.println("enter how many fibonacci number you want to print ");
		Scanner sc=new Scanner(System.in);
        int total= sc.nextInt();
		int first = 0;
		int second = 1;
		int third = 0;
		int current = 0;
		int prev = 1;
		int beprev = 0;
		for (int i = 0; i < total; ++i) {
			if (i == 0) { System.out.println(first);
				beprev = first;
			}
			if (i == 1)

			{ System.out.println(second);

				prev = second;
			}

			if (i > 1) {
				current = prev + beprev;
				System.out.println(current);
				beprev = prev;
				prev = current;

			}
		}

	}
}
