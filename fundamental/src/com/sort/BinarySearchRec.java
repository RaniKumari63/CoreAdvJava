package com.sort;

import java.util.Scanner;

public class BinarySearchRec {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int len=sc.nextInt();
		int li=0;
		int hi=len-1;
		int mi=(li+hi)/2;
		int [] array1=new int[len];
		System.out.println("Enter the value ascending ");
		for(int i=0;i<array1.length;i++)
		{  
			array1[i]=sc.nextInt();
		}
		System.out.println("Number to be searched");
		int num=sc.nextInt();
		BinarySearchRec obj=new BinarySearchRec();
		int index= obj.binarySearch(li,hi,num,array1);
		System.out.println("number is present  at "+index);
	}

	int binarySearch(int low,int high,int key,int[] array2) {
		
		int mid=0;
	if(low==high)
	{
		if(array2[low]==key)
			return low;
		else
			return 0;
	}
	else
	{ 
		mid=(low+high)/2;
		if(key==array2[mid])
			return mid;
		if(key<array2[mid])
			return binarySearch(low,mid-1,key,array2);
		else
			return binarySearch(mid+1,high,key,array2);
			
	}
		
	}

	
}

