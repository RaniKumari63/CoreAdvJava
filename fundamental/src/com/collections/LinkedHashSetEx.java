package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashSet <String> set=new LinkedHashSet<String>();
set.add("one");
set.add("two");
set.add("three");
set.add("four");
set.add("five");
set.add(null);
set.add("five");
Iterator<String> i=set.iterator();
while(i.hasNext())
{
	System.out.println(i.next());
}

set.remove("one");

System.out.println(set);
	}

}
