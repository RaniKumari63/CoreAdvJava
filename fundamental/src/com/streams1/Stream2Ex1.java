package com.streams1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Stream2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> l=new ArrayList<Integer>();
l.add(0);
l.add(10);
l.add(20);
l.add(5);
l.add(15);
System.out.println(l);
List<Integer> l1=l.stream().filter(i->i%2==0).collect(Collectors.toList());
System.out.println(l1);
List<Integer> l2=l.stream().map(i->i*2).collect(Collectors.toList());
	}

}
