package com.lang2;

public class StringEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1=new String("you cannot change me!"); //heap and scp- 2
String s2=new String("you cannot change me!");//heap and scp-2
System.out.println(s1==s2);// false
String s3="you cannot change me"; //scp -1
System.out.println(s1==s3);//false 
String s4="you cannot change me!"; //scp-0
System.out.println(s3==s4);//true
String s5="you cannot "+"change me!"; //scp-0
System.out.println(s3==s5);//true
String s6="you cannot ";
String s7=s6+"change me!";
System.out.println(s3==s7);//false
final String s8="you cannot ";
String s9=s8+"change me!";
System.out.println(s3==s9);//true
System.out.println(s6==s8);//true

	}

}
