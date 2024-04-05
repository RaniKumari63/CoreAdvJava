package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] s=new String[100000];
s[0]="durga";
s[1]="ravi";
//s[2]=new Integer(10);//type safe
ArrayList<String> l7=new ArrayList<String>();
l7.add("ggggg");
l7.add("jjjjj");

ArrayList<String> l8=new ArrayList<String>();
l8.add("ggggg");
l8.add("jjjjj");

ArrayList<String> l=new ArrayList<String>();
l.add("vijaya");
l.add("bhaskara");


l.addAll(l7);
l.addAll(0,l7);
l.addAll(1,l8);
System.out.println(l.contains("vijaya"));
//l.replaceAll(l8);
l.retainAll(l8);

String str=l.get(0);
l.add("rani");
l.addAll(l);
System.out.println("hhhhhhhhhhh"+str);
//String name1=(String)l.get(0);//type casting
ArrayList<Integer> l5=new ArrayList<Integer>();
l5.add(0);
l5.add(1);
l5.add(2);
//l5.add("gggg");
Integer i=(Integer)l5.get(0);
ArrayList<String> l1=new ArrayList<String>();
l1.add("vijaya");
l1.add("bhaskara");
String name2=l1.get(0);//type casting


ArrayList<String> l4=new ArrayList<String>();
List<String> l2=new ArrayList<String>();
Collection<String>l3=new ArrayList<String>();
//ArrayList<Object> l4=new ArrayList<String>();
//ArrayList<char> l6=new ArrayList<char>();
}
}