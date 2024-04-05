package com.lang2;

import java.util.Arrays;
import java.util.Scanner;

public class VowelEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.next();

		
		  vowels(str); trimmethod(str); lowercase(str); upper(str); palindrome(str);
		  reverse(str); duplicate(str); charAtIdex(str);
		  System.out.println("enter character to be replaced"); char
		  ch=sc.next().charAt(0);
		  System.out.println("enter which  character to be placed "); char
		  ch1=sc.next().charAt(0); replaceAll(str,ch,ch1);
		  
		  
		  
		  maxmin(str);
		 
		//secondmost(str);
		//swapWot();
		//swapWt();
		removeDuplicate(str);

	}

	static void vowels(String str) {
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == 'a') || (str.charAt(i) == 'A') || (str.charAt(i) == 'e') || (str.charAt(i) == 'E')
					|| (str.charAt(i) == 'i') || (str.charAt(i) == 'I') || (str.charAt(i) == 'O')
					|| (str.charAt(i) == 'o') || (str.charAt(i) == 'U') || (str.charAt(i) == 'u')) {

				System.out.print("Vowel " + str.charAt(i) + "\t");

			}

		}

	}

	static void trimmethod(String str1) {
		System.out.println(" ");
		System.out.println(str1.trim());
	}

	static void lowercase(String str2) {
		System.out.println(str2.toLowerCase());
	}

	static void upper(String str3) {
		System.out.println(str3.toUpperCase());
	}

	static void palindrome(String str4) {
		char[] rev = new char[str4.length()];
		for (int i = str4.length() - 1, j = 0; (i >= 0 && j <= str4.length()); i--, j++) {
			rev[j] = str4.charAt(i);

		}
		String revstr = String.valueOf(rev);

		if (revstr.equalsIgnoreCase(str4)) {
			System.out.println("string is palindrome");
		} else {
			System.out.println("string is not palindrome");
		}
	}

	static void maxmin(String str5) {
		int flag = 0;
		int[] num = new int[str5.length()];

		for (int i = 0; i < str5.length(); i++) {
			char value = str5.charAt(i);
			flag = 0;
			for (int j = 0; j < str5.length(); j++) {
				if (value == str5.charAt(j)) {

					flag++;
					num[i] = flag;
				}
			}

		}
		int max = num[0];
		int maxindex = 0;

		int min = num[0];
		int minindex = 0;

		for (int i = 0; i < str5.length(); i++) {

			if (max < num[i]) {
				max = num[i];
				maxindex = i;
			}

			if (min > num[i]) {

				min = num[i];
				minindex = i;

			}

		}
		System.out.println(str5.charAt(maxindex) + " " + max);
		System.out.println(str5.charAt(minindex) + " " + min);
		
	}

	static void reverse(String str6) {
		char[] rev = new char[str6.length()];
		for (int i = str6.length() - 1, j = 0; (i >= 0 && j <= str6.length()); i--, j++) {
			rev[j] = str6.charAt(i);

		}
		String revstr = String.valueOf(rev);
		System.out.println(revstr);

	}

	static void duplicate(String str5) {
		int flag = 0;
		int flag1 = 0;
		char[] chararr = str5.toCharArray();

		for (int i = 0; i < str5.length(); i++) {
			flag = 0;
			for (int j = i + 1; j < str5.length(); j++) {

				if (chararr[i] == chararr[j]) {
					flag++;
					flag1++;
					chararr[j] = ' ';
				}

			}

			if (flag == 1) {
				System.out.println(chararr[i]);
			}

		}

		if (flag1 == 0) {
			System.out.println("No duplicate characters");
		}

	}

	static void charAtIdex(String str7) {
		int index[] = new int[str7.length()];
		System.out.println("enter the character");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int count = 0;
		for (int i = 0; i < str7.length(); i++) {

			if (ch == str7.charAt(i)) {
				index[count] = i;
				count++;
			}
		}
		System.out.println("the character at position" + Arrays.toString(index) + "is \t" + ch);

	}

	static void replaceAll(String str8, char ch, char ch1) {
		str8 = str8.replace(ch, ch1);
		System.out.println(str8);
	}

	static void removeDuplicate(String str5) {
		int flag = 0;
		 
		char[] chararr = str5.toCharArray();

		for (int i = 0; i < str5.length(); i++) {
			flag = 0;
			for (int j = i + 1; j < str5.length(); j++) {

				if (chararr[i] == chararr[j]) {
					flag++;
					
					chararr[j] = ' ';
					
				}

			}

			if (flag != 1) {
				System.out.print(chararr[i]);
			}

		}

	}

	static void secondmost(String str5) {

		
		int[] num = new int[256];
		for(int i=0;i<str5.length();i++)
		{
		 num[str5.charAt(i)]++;
		 
		}
		int first=0; int second=0;
		for(int i=0;i<256;i++)
		{
			
		if(num[i]>num[first])
		{
			second=first;
			first=i;
			
		}
		else if(num[i]>num[second]&&num[i]!=num[first])
			second=i;
		}
		System.out.println((char)(second));
		
		
	}
	
	
	static void swapWot()
	{ Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String str1=sc.next();
		System.out.println("enter second string");
		String str2=sc.next();
		str1=str1+str2;
		
		
		str2=str1.substring(0,(str1.length()-str2.length()) );
		str1=str1.substring(str2.length());
		System.out.println(str1);
		System.out.println(str2);
		
		
	}
	static void swapWt()
	{ Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String str1=sc.next();
		System.out.println("enter second string");
		String str2=sc.next();
		String temp=" ";
		temp=str1;
		str1=str2;
		
		str2=temp;
		System.out.println(str1);
		System.out.println(str2);
		
		
	}


}
