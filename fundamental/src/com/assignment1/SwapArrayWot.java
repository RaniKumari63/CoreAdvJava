package com.assignment1;

import java.util.Scanner;

public class SwapArrayWot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int index = sc.nextInt();
		int firstarr[] = new int[index];
		int secarr[] = new int[index];
		
		System.out.println("Enter the First Array");
		for (int i = 0; i < firstarr.length; i++) {
			System.out.println("Enter the value");
			firstarr[i] = sc.nextInt();
		}
		System.out.println("Enter the Second Array");
		for (int i = 0; i < secarr.length; i++) {
			System.out.println("Enter the value");
			secarr[i] = sc.nextInt();
		}

		for (int i = 0; i < firstarr.length; i++) {
			 firstarr[i]=firstarr[i]+secarr[i];
             secarr[i]=firstarr[i]-secarr[i];
			firstarr[i]=firstarr[i]-secarr[i];
		}
 for(int i=0;i<firstarr.length;i++)
 {
	 System.out.println(firstarr[i]);
	
 }
 for(int i=0;i<firstarr.length;i++)
 {
 System.out.println(secarr[i]);
 }
	}
}
