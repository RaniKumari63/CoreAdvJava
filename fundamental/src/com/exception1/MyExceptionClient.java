package com.exception1;

import java.util.Scanner;

public class MyExceptionClient {

	public static void main(String[] args) throws MyException {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string");
		String word="India";
		String sentence=sc.nextLine();
		if(sentence.contains(word))
			throw new MyException();
		else
			System.out.println("String entered successfully");
	}

}
