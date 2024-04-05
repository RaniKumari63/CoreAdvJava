package com.java8features;

import java.util.function.Predicate;

public class Test22 {
public static void predicate_or()
{
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate<String> length10=s->{ if(s.length()>10)return true;
else
	return false;
};

Predicate<String> containslettera=s1->s1.contains("A");
String str="And";
boolean outcome=length10.or(containslettera).test(str);
System.out.println(outcome);
boolean outcome1=length10.and(containslettera).test(str);
System.out.println(outcome1);
boolean outcome2=length10.and(containslettera).negate().test(str);
System.out.println(outcome2);

	}

}
