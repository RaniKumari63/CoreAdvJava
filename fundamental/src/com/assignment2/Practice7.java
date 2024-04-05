package com.assignment2;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice7 p7 = new Practice7();
		System.out.println("Enter the string value");
		Scanner sc = new Scanner(System.in);
		String str2 = sc.next();
		String str1 = p7.encrypt(str2);
		System.out.println("original string" + str2);
		System.out.println("reverse string" + str1);
	}
	
	

	String encrypt(String str) {
		char ch[] = str.toCharArray();

		String revString = "";
		char revch[] = new char[ch.length];
		for (int i = ch.length - 1, j = 0; ((i >= 0) && (j < ch.length)); i--, j++) {

			if (Character.isAlphabetic(ch[i]))

			{
				revch[j] = ch[i];
				revString += revch[j] + "";

			} else {
				revString = null;
				break;
			}
		}

		return revString;
	}
}
