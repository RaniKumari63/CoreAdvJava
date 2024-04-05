package com.assignment1;

import java.util.Scanner;

public class FibEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter how many fibonacci number you want to print ");
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int first = 0;
		int second = 1;
		int current = 0;
		int prev = 1;
		int beprev = 0;
		for (int i = 0; i < total; ++i) {
			if (i == 0) {
				System.out.println(first);
				beprev = first;
			}
			if (i == 1)

			{
				System.out.println(second);

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
