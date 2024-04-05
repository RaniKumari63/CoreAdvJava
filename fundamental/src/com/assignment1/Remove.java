package com.assignment1;

import java.util.Scanner;

public class Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int remove=0;
		int index=0;
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value");
			arr[i] = sc.nextInt();
			
		}
		System.out.println("Enter the value to be removed");
		  remove=sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==remove)
			{
			index=i;
			
			}
			
		}
			
	
	for(int i=index;i<(arr.length)-1;i++)
	{
		arr[i]=arr[i+1];
	}
	arr[(arr.length)-1]=0;
			
for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	
	}
	
	}


