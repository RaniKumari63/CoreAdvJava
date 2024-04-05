
package com.exception1;

import java.util.Scanner;
class ArrayLimitException extends Exception {
	public ArrayLimitException(){
	super("Array limit out of bounds");
	}
	}

public class ArrayMain {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0;
		int max;
		System.out.println("enter the limit");
		int x=sc.nextInt();
		int n;
		System.out.println("enter the size");
		n=sc.nextInt();
		int[]arr = new int[n];
		System.out.println("enter the elements");
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
			}
			try {
			inputArray(arr,x,n);
			System.out.println("elements inserted successfully");
			max=max_Array(arr);
			System.out.println("The maximum is "+max);
			} catch (ArrayLimitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
	}
	public static void inputArray(int[]arr,int x,int n) throws ArrayLimitException
	{
		int i;
		for(i=0;i<n;i++)
		{
			if(arr[i]>=x)
			{
			throw new ArrayLimitException();
			}
		}
	
	}
	static int max_Array(int[] arr)
	{
		int i;
		int max=arr[0];
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
	return max;	
	}

}
