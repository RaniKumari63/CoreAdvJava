package com.iterate;

import java.util.Scanner;

public class For23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		System.out.println("please enter name");
		Scanner sc=new Scanner(System.in);
		String name=sc.next();
		String rev="";
		int len=name.length();
		for(int i=len-1;i>=0;i-- )
			rev+=name.charAt(i);
		
		System.out.println(rev);
	}

}
