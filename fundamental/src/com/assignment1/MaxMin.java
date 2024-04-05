package com.assignment1;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int maxtemp=0;
int mintemp=0;
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value");
			arr[i] = sc.nextInt();
			
		}
		maxtemp=arr[0];
		mintemp=arr[0];
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]>maxtemp)
			{
				maxtemp=arr[j];
				
			}
			if(arr[j]<mintemp)
			{
				mintemp=arr[j];
			}
			
			}
		System.out.println("the maximum value is"+maxtemp);
		System.out.println("the minimum value is"+mintemp);
			
		}
		
	}


