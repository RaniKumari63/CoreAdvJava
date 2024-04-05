package com.collections;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();
al.add(100);
al.add(250);
al.add(365);
al.add(125);
al.add("shiva");
al.add(null);

al.add(1,260);
System.out.println(al);
ArrayList al1=new ArrayList();
al1.add("shiva");
al1.add(100);
System.out.println(al1);
al.addAll(al1);
System.out.println(al);
//al.removeAll(al1);
System.out.println(al);
al.retainAll(al1);
System.out.println(al);
//al.clear();

System.out.println(al.contains(99));
System.out.println(al.contains(99));
}
}