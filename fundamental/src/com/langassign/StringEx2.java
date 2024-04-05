package com.langassign;

import java.util.Arrays;
import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str1=sc.next();
		String newString=removeAdjacentRepeatedCharacters(str1);
		System.out.println("the new string is\""+newString+"\"");
	}
static String removeAdjacentRepeatedCharacters(String str1)
{
	char[] sarr=new char[str1.length()];
	char[] newarr=new char[str1.length()];
	int k=0;
	char prev=0;
	sarr=str1.toCharArray();
	for(char c:sarr)
	{ 
	   
		if(prev!=c)
		{   newarr[k++]=c;
			prev=c;
			
		}
		else if(prev==c)
		{
		 newarr[k--]=0;
			prev=0;
			newarr[k++]=0;
			
		}
		
		}
		
	
	
	
	
	
	return Arrays.toString(sarr);

}}
