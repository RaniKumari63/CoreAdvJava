package com.assignment1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		System.out.println("Enter size of array");
		Scanner sc1=new Scanner(System.in);
		int index=sc1.nextInt();
		int arr[]=new int[index];
		int facarr[]=new int[index];
		int temp=0;
		 for(int i=0;i<arr.length;i++)
		 {
			System.out.println("Enter the value");
			arr[i]=sc1.nextInt();
		 }
		for(int i=0;i<arr.length;i++)
		{ temp=arr[i];
		 facarr[i]=1;
		while(arr[i]!=0)
		{
			facarr[i]*=arr[i];
			arr[i]=arr[i]-1;
			
		}
		arr[i]=temp;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+"\t"+facarr[i]);
			
			
		}
		
	}

}
