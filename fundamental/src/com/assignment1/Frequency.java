package com.assignment1;

import java.util.Scanner;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.out.println("Enter size of array");
	Scanner sc=new Scanner(System.in);	
	int index=sc.nextInt();
	int arr[]=new int[index];
	int fre[]=new int[index];
	int count=0;
	for(int i=0;i<arr.length;i++)
	{  System.out.println("Enter the value");
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length;i++)
	{  	   
		for(int j=i+1;j<arr.length;j++)
	{
		 if(arr[i]==arr[j])
		 {
			 count++;
			 
		 }
		 
	}
		fre[i]=count;
		System.out.println(arr[i]+"\t\t"+fre[i]);
	}
	
		
	}

}
