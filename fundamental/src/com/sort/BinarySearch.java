package com.sort;

import java.util.Scanner;

public class BinarySearch {

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
		while(li<=hi) {
			

		if(array1[mi]==num)
		{System.out.println("Number is at "+mi);
		break;
			
		}
		else if(array1[mi]<num)
		{ System.out.println("hai");
			li=mi+1;
		}
		else if(array1[mi]>num)
		{ System.out.println("hello");
			hi=mi-1;
		}
				mi=(li+hi)/2;
		}
	}
}
