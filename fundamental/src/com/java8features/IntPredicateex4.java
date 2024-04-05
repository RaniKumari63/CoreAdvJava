package com.java8features;

import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

public class IntPredicateex4 {
	static IntPredicate lessthan=x2->x2<544331;
	static IntPredicate equaltoo=x3->x3==544331;
	static IntPredicate greaterthan=x4->x4>544331;
	static IntPredicate anddd=lessthan.and(equaltoo).and(greaterthan);
	static IntPredicate orrr=lessthan.or(equaltoo).or(greaterthan);
	static IntPredicate neg=lessthan.negate();
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

System.out.println(lessthan.test(544331));
System.out.println(equaltoo.test(544331));
System.out.println(greaterthan.test(544331));
System.out.println(anddd.test(544331));
System.out.println(orrr.test(544331));
System.out.println(neg.test(544331));
	}


}
