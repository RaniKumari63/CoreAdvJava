package com.assignment1;

import java.util.Scanner;

public class Sum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		

		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value");
			arr[i] = sc.nextInt();
			total += arr[i];

		}
		
		System.out.println(" Sum  of array is" + total);

	}

}
