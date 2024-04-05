package com.wrapper;

import java.util.ArrayList;

public class WrapperEx2 {
//int to integer-------------autoboxing---internally calls valueof
	//integer to int -------------autounboxing-------calls intValue
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean b=new Boolean(true);
		if(b) {
		System.out.println("hello");
		}
		ArrayList l=new ArrayList();
		Integer i=new Integer(10);
		l.add(i);
		Integer i1=10;
		int i2=I1;
		System.out.println(i2);//0
		Integer x=10;
		Integer y=x;
		++x;
		System.out.println(x);//11
		System.out.println(y);//10
		System.out.println(x==y);//false
		
		

	}

}
