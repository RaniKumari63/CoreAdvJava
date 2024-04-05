package com.java8features;

import java.util.function.Predicate;



public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate<Integer> p1=i-> i%2==0;
System.out.println(p1.test(10));
System.out.println(p1.test(15));

//Predicate<Employee> p1=e->e.salary>100000 && e.isHavingGf==true;

Predicate<String> p2=S->((S.length()>5));
System.out.println(p2.test("yyyyyyyyyy"));
System.out.println(p2.test("yyyyyyygggggggggyyy"));
System.out.println(p2.test("yy"));

String[] s= {"Nag","Chiranjeevi","Venkatesh","Balaiah","Sunny","Katrina"};
Predicate<String> p=s1->s1.length()>5;
for(String s1:s)
{
if(p.test(s1))	
{
	System.out.println(s1);
}
}


Predicate<String> p6=s2->s2.length()%2==0;
for(String s1:s)
{
if(p6.test(s1))	
{
	System.out.println(s1);
}
}
	}

}
