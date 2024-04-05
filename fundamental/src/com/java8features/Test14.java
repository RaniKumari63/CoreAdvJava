package com.java8features;

import java.util.function.Predicate;

public class Test14 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//prime number
Predicate<Integer> p =i->i%2==0;
System.out.println(p.test(10));
System.out.println(p.test(11));
//string is >5
String []s= {"rani","lilly","manisha","maya","shiva","anil"};
Predicate <String>p1= s1->s1.length()>5;
for(String s2:s)
{
	if(p1.test(s2))
		System.out.println(s2);
}
	
//
	
	
	
	}

}
