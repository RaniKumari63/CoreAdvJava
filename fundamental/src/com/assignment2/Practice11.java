package com.assignment2;

import java.util.Scanner;

public class Practice11 {
Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice11 p=new Practice11();
		System.out.println("Enter the size of array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[][] array=new int[size][size];
		
		
		int[] retarray=new int[3];
		if((array==null)||(array.length!=3)) {
			retarray=null;
							System.out.println(retarray);
			
		}
		else{retarray=p.getRowSum(array);
		for(int i=0;i<retarray.length;i++)
		{
			System.out.println(retarray[i]);
		}
		}
		
		
	}
	int[] getRowSum(int num[][])
	{
		for(int i=0;i<num.length;i++)
		{ 
			for(int j=0;j<num.length;j++)
			{
				System.out.println("Enter the value");
				num[i][j]=sc.nextInt();
				
			}
		}
		int[] total=new int[num.length];
		 for(int k=0;k<num.length;k++)
		 {
		 for(int j=0;j<num.length;j++) {
			 
		    total[k]+=num[k][j];
		 } 
		 
		
		
		
		
				
	}
return total;
}
}
