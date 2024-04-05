package com.java8features;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate<Integer>p=i->i%2==0;
System.out.println(p.test(10));

Function<Integer,Integer> f=i->i*i;
Function<Integer,Integer> f8=i->i*i*i;
System.out.println(f.andThen(f8).apply(2));//f and f8
System.out.println(f.compose(f8).apply(2));//f8 and f
System.out.println(f.apply(4));
System.out.println(f.apply(5));



Function<String,Integer> f1=s->s.length();
System.out.println(f1.apply("ffffffffffffffffffffffff"));
Function<String,String> f2=s->s.toUpperCase();
System.out.println(f2.apply("ffffffffffffffffffffffff"));


	}

}
