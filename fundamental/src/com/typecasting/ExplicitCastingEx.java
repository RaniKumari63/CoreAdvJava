package com.typecasting;

public class ExplicitCastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int sno=100;
	byte b=(byte)sno;
	byte c=20;
	byte d=(byte)(b+c);
	
	
	short s=(short)sno;
	System.out.println(s);
	short s1=(short)(b+c);
	System.out.println(s1);
	
	char ch='a';
	char ch1='b';
	char ch2=(char)(ch1+ch);
	char ch3='a';
	char ch4='b';
	//char ch5=(ch3+ch4);
	
	char ch6='a';
	char ch7='b';
	int ch8=ch6+ch7;
	System.out.println(ch8);
	
	
	
	}

}
