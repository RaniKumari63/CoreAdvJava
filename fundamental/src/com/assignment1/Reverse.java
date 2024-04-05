package com.assignment1;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		int arr[] = new int[index];
		int revarr[] = new int[index];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value");
			arr[i] = sc.nextInt();

		}
		for (int j = arr.length - 1, i = 0; (j >= 0) && (i < arr.length); j--, i++) {
			revarr[j] = arr[i];
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t"+revarr[i]);
			
		}

	}

}
