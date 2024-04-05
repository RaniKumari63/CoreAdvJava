package com.assignment1;

import java.util.Scanner;

public class Check2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int check=0;
		int count=0;
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value");
			arr[i] = sc.nextInt();
			
		}
		System.out.println("Enter the value to be checked");
		  check=sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==check)
			{
				System.out.println(check+"is in a array at index"+i);
			
			}
			else
			{
				count++;
			}
			
		}
		if(count==arr.length)
		{
			System.out.println(check+"is not present in array");
		}
	}

}
