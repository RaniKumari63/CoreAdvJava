package com.assignment1;

import java.util.Scanner;

public class Copy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		int arr[] = new int[index];
		int copyarr[]=new int[index];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value");
			arr[i] = sc.nextInt();

		}
		
		for(int i=0;i<arr.length;i++)
		{
		 copyarr[i]=arr[i];
		}
		
		for(int i=0;i<arr.length;i++)
		{
		 System.out.println(copyarr[i]);		}
		
	
		
		
		
	}

}
