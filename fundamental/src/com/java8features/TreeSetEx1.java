package com.java8features;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet<Integer> t=new TreeSet<Integer>((i1,i2)->(i1>i2)?-1:(i1<i2)?1:0);
t.add(10);
t.add(0);
t.add(15);
t.add(25);
t.add(5);
t.add(20);
System.out.println(t);
	}

}
