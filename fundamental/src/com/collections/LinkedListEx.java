package com.collections;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList l=new LinkedList();
l.add(10);
l.add(20);
l.add(30);
l.add(40);
l.add(50);
l.add("rani");
LinkedList l1=new LinkedList(l);
l.addAll(l1);
System.out.println(l);
l.add(null);
System.out.println(l);
l.set(0, "Software");
l.add(0,"venky");
l.removeLast();l.addFirst("ccc");
System.out.println(l);

	}
	}

