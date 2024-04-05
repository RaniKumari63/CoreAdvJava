package com.java8features;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

public class Test25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
IntPredicate p=i->i%2==0;
System.out.println(p.test(40));
Function<Integer,Integer>f=i->i*i;
System.out.println(f.apply(4));
IntFunction<Integer> f1=i->i*i;
System.out.println(f1.apply(4));
ToIntFunction<Integer> f2=i->i*i;
System.out.println(f2.applyAsInt(4));
Function<String,Integer> f3=s->s.length();
System.out.println(f3.apply("durga"));
ToIntFunction<String> f4=s->s.length();
System.out.println(f4.applyAsInt("gggggggggg"));
IntToDoubleFunction f5=i->Math.sqrt(i);
System.out.println(f5.applyAsDouble(7));
	}

}
