package com.java8features;


public class FunctionalInEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Addtion a=(fno,sno)->
	{
		int result=fno+sno;
		return result;
	};
	int result1=a.add(100, 200);
	System.out.println("addition of two numbers"+result1);	
	
	Substraction s=()->
	{
		int fno=100;
		int sno=900;
		System.out.println("substraction of two numbers"+(sno-fno));
	};
	s.sub();
	Multiplication m=(k,l)->{
		System.out.println("multiplication of two numbers"+(k*l))	;
	};
	m.mul(500,2);
	}

	
	
	
}
