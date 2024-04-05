package com.assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class Practice3 {
	static Scanner sc=new Scanner(System.in);
static int findMax(int[] array1) {
	int no=0;
	int max=0;
	int negcount=0;
	
	if(array1==null)
	{
		no=0;
	}
	
	else {
	for(int i=0;i<array1.length;i++)
	{
		if(array1[i]<0)
		{
			negcount++;
		}
		else if(array1[i]>=0)
		{
			 if(max<array1[i])
			 {
				 max=array1[i];
			 }
			 no=max;
		}
		}
	if(negcount!=3)
	{
		no=-1;
	}
	
	
	
	}
return no;
}



			   public static void main(String[] args) {
			        // TODO Auto-generated method stub
				   
				   int[] array4=null;
				
				int value=findMax(array4);  
				System.out.println(value);
			   }



			}




