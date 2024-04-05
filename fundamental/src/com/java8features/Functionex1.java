package com.java8features;

import java.util.function.Function;

public class Functionex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Integer,Integer>f=i->i*i;
		System.out.println(f.apply(4));
		System.out.println(f.apply(2));
		Function<Integer,Double>half=a->a/2.0;
		System.out.println(half.apply(10));
		try {
		half=half.compose(a->3*a);
		
		System.out.println(half.apply(10));
		}
		catch(Exception e)
		{
			System.out.println("vvvvvvvvv"+e);
		}
		
	}

}
