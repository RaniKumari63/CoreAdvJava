package com.lang2;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
duplicatewords(str);
	}

	
	static void  duplicatewords(String str9)
	{ str9=str9.toLowerCase();
	int flag=0;
	int flag1=0;
String[] words=str9.split(" ");
for (int i = 0; i < words.length; i++) {
	flag=0;
	for (int j =i+1; j < words.length; j++) {
		
		if(words[i].equals(words[j]))
		{
			flag++;
			
			flag1++;
			words[j]=" ";
		}
		
		
	}
	
if(flag==1)
{ System.out.print(words[i]);}




}
if(flag1==0)
{
System.out.println("No duplicate words");	
}
	
		
	}
	
}
