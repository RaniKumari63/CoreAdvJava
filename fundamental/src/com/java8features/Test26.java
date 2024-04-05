package com.java8features;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

public class Test26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UnaryOperator<Integer>	 f=i->i*i;
		System.out.println(f.apply(5));
		
		IntUnaryOperator f1=i1->i1*i1;
		System.out.println(f1.applyAsInt(9));
		DoubleUnaryOperator f2=i1->i1*i1;
		System.out.println(f2.applyAsDouble(9));
		
		
		
		BiFunction<String,String,String> f4=(s1,s2)->s1+s2;
		System.out.println(f4.apply("durga","software"));

		BinaryOperator<String> f5=(s1,s2)->s1+s2;
		System.out.println(f5.apply("durga","software"));
		
		BinaryOperator<Integer> f6=(i1,i2)->i1+i2;
		System.out.println(f6.apply(10,20));
		IntBinaryOperator  f7=(i1,i2)->i1+i2;
		System.out.println(f7.applyAsInt(10,20));
		
	}

}
