package com.assignment1;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		int arr[] = new int[index];
		int temp=0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the value");
			arr[i] = sc.nextInt();

		}
		System.out.println("Enter how many smallest values less than  index value");
       Scanner sc1=new Scanner(System.in);
       int k=sc1.nextInt();
       
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			 if(arr[i]>arr[j])
			 {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			 }
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}
	}

}
