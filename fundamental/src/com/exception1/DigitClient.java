package com.exception1;

import java.util.Scanner;

public class DigitClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String check=sc.next();
		int i;
		int lcount=0,ucount=0;
		try
		{
			for(i=0;i<check.length();i++)
			{char c=check.charAt(i);
			if(Character.isLowerCase(c))
			{
				lcount++;
			}
			else if(Character.isUpperCase(c))
			{
				ucount++;
			}
			else if(!Character.isLetter(c)) throw  new DigitException();
				
			}
		}
		catch(DigitException e)
		{e.printStackTrace();
			
		}
		
		if(lcount!=0 && ucount==0)
		{
			System.out.println("The letters are small letters");
			
		}
		if(ucount!=0 && lcount==0){
			System.out.println("The letters are capital letters");
			}
			else if(lcount!=0 && ucount!=0){
			System.out.println("The letters contain both capital and small letters");
			}

	}

}
