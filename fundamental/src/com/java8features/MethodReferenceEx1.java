package com.java8features;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> names=Arrays.asList("navin","manoj","priya","anto");
names.forEach(n->System.out.println(n));
names.forEach(System.out::println);
	}

}
