package com.iterate;

import java.util.Scanner;

public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		int count = 0;
		if (num == 0 || num == 1) {
			System.out.println("given number is prime");
		} else {
			for (int i = 2; i < num; ++i) {
				if (num % i == 0) {
					System.out.println("not prime");
					count++;
					break;
				}

			}
			if (count == 0)
				System.out.println("prime");
		}
	}

}
