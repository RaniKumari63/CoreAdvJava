package com.assignment1;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstmax = 0;
		int firstmin = 0;
		int secmax = 0;
		int secmin = 0;
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value");
			arr[i] = sc.nextInt();

		}
		firstmax = arr[0];
		secmax = arr[0];
		
		firstmin = arr[0];
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] > firstmax) {
				firstmax = arr[j];

			}
			


			if (arr[j] < firstmin) {
				firstmin = arr[j];
			}

		}
		
secmin=firstmax;
		for (int j = 0; j < arr.length; j++) {
			
			
			if ((arr[j] < firstmax) && (arr[j] > secmax)) {
				secmax=arr[j];

			}
			
			if ((arr[j] > firstmin) && (arr[j] <secmin)) {
				secmin=arr[j];

			}
			
		}
		System.out.println("the first maximum value is" + firstmax);
		System.out.println("the first minimum value is" + firstmin);
		System.out.println("the second maximum value is" + secmax);
		System.out.println("the second minimum value is" + secmin);
		

	}

}
