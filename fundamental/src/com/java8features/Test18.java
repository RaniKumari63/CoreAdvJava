package com.java8features;

import java.util.function.Predicate;

public class Test18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate<Integer> lesserthan =i->i<18;
System.out.println(lesserthan.test(10));
Predicate<Integer> greaterthan =i->i>10;
Predicate<Integer> lowerthantwenty =i->i<20;
boolean result=greaterthan.and(lowerthantwenty).test(15);
System.out.println(result);
boolean result2=greaterthan.and(lowerthantwenty).negate().test(15);
System.out.println(result2);
	}

}
