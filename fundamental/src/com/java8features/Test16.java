package com.java8features;

import java.util.function.Predicate;

public class Test16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate<Integer> p1=i->i%2==0;
System.out.println(p1.test(10));
System.out.println(p1.test(11));
	
String[] s= {"rani","manisha","maya","shiva","anil"};
Predicate <String> p2=s1->s1.length()>5;
for(String s2:s)
{ if(p2.test(s2))
	System.out.println(s2);
}
		
	}

}
