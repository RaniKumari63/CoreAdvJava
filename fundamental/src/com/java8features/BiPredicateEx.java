package com.java8features;

import java.util.function.BiPredicate;

public class BiPredicateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiPredicate<Integer,Integer> p=(a,b)->(a>b&&b<a);
System.out.println(p.test(10, 20));
BiPredicate<Integer,Integer>p1=(a,b)->(a+b)%2==0;
System.out.println(p1.test(15, 20));
System.out.println(p1.test(10, 20));

	}

}
