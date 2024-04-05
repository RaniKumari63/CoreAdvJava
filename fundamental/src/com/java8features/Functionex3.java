package com.java8features;

import java.util.function.Function;

public class Functionex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Function<Integer,Integer> i=Function.identity();
		System.out.println(i.apply(10));
	}

}
