package com.langassign;

import java.util.Scanner;

public class StringEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=sc.nextLine();
		printLargestSmallestWord(str1);
		
	}
static void printLargestSmallestWord(String str)
	{ String[] words=str.split(" ");
	
		int maxlength,minlength;
		maxlength=Integer.MAX_VALUE;
		minlength=Integer.MIN_VALUE;
		String largest,smallest;
		largest=smallest="";
		
		
		for(int i=0;i<words.length;i++)
		{	
			if(words[i].length()>minlength)
		{
			largest=words[i];
			//System.out.println("hello"+smallest);
			minlength=words[i].length();
			
			
		}
		if(words[i].length()<maxlength)
		{ 
			smallest=words[i];
			//System.out.println("hai"+largest);
		maxlength=words[i].length();
			//System.out.println(largest);
		}
			
		} 
		System.out.println("the largest and smallest words\""+largest+"\t"+smallest);
	}
}
