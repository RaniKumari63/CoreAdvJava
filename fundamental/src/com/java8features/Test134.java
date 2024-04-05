package com.java8features;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Test134 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[]x= {0,5,10,15,20,25,30,35};
	Predicate<Integer> p1=i->i%2==0;
	Predicate<Integer> p2=i->i>10;
	System.out.println("The number which are even and >10 are");
	for(int x1:x)
	{
		if(p1.and(p2).test(x1))
		{
			System.out.println(x1);
		}
		if(p1.or(p2).test(x1))
		{
			System.out.println(x1);
		}
		if(p1.negate().test(x1))
		{
			System.out.println(x1);
		}
	}
	}

}
