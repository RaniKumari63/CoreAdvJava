package com.flowcontrol;

import java.util.Scanner;

public class IfEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter lower case alphabet");
Scanner sc=new Scanner(System.in);
String str=sc.next();
char ch=str.charAt(0);
int letter=ch;
int letter1=letter-32;
System.out.println("lower case letter"+(char)letter);
System.out.println("upper case letter"+(char)letter1);


System.out.println("please enter upper case alphabet");
Scanner sc1=new Scanner(System.in);
String str1=sc.next();
char ch1=str1.charAt(0);
int letter2=ch1;
int letter3=letter2+32;
System.out.println("upper case letter"+(char)letter2);
System.out.println("lower case letter"+(char)letter3);
	}

}
