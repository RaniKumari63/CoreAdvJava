package com.assignment1;

import java.util.Scanner;

public class Duplicate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		int arr1[] = new int[index];
		int arr2[] = new int[index];
		System.out.println("Enter first array");
		for (int i = 0; i < arr1.length; i++) {

			arr1[i] = sc.nextInt();

		}

		System.out.println("Enter second array");
		for (int i = 0; i < arr2.length; i++) {

			arr2[i] = sc.nextInt();

		}

		for (int i = 0; i < arr1.length; i++) {

			for (int j = 0; j < arr2.length; j++) {

				if (arr1[i] == (arr2[j])) {
					System.out.println(arr1[i]);

				}
			}
		}

	}

}
