package com.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Practice14 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the Integer");

		int no = sc.nextInt();
		System.out.println(Arrays.toString(getIncreaseDecrease(no)));
	}

	static int[] getIncreaseDecrease(int num) {
		int[] arr;
		if (num <= 1 || num > 20) {
			arr = null;
		} else {
			arr = new int[num];
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Enter Array Elements");
				arr[i] = sc.nextInt();
			}
		}
		return arr;
	}

}
