package com.java8features;

import java.util.function.BiPredicate;

public class BiPredicateex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiPredicate<Integer,String> sa=(n,s)->
{
	if(n==Integer.parseInt(s))
		return true;
	return false;
};
System.out.println(sa.test(2,"2"));
BiPredicate<Integer,String> sa1=(n,s)->n>Integer.parseInt(s);
System.out.println(sa1.test(3, "2"));
BiPredicate<Integer,String> sa2=sa.and(sa1);
BiPredicate<Integer,String> sa3=sa.or(sa1);
BiPredicate<Integer,String> sa4=sa.negate();
System.out.println(sa2.test(3, "2"));
System.out.println(sa3.test(3, "2"));
System.out.println(sa4.test(3, "2"));
	}


}
