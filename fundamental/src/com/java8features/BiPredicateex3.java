package com.java8features;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

public class BiPredicateex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


int[] x= {0,5,10,20,25,30,40};
IntPredicate p1=i->i%2==0;
for(int x1:x)
{
	if(p1.test(x1))
	{
		System.out.println(x1);
		
	}
}
	}


}
