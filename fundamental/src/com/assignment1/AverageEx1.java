package com.assignment1;

import java.util.Scanner;

public class AverageEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		int avg = 0;

		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value");
			arr[i] = sc.nextInt();
			total += arr[i];

		}
		avg = total / arr.length;
		System.out.println(" Average  of array is" + avg);

	}

}
