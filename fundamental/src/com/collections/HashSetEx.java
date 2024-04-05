package com.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet h=new HashSet();
h.add("b");
h.add("c");
h.add("d");
h.add("z");
h.add(null);
h.add(10);
h.add("z");
System.out.println(h);
LinkedHashSet h1=new LinkedHashSet();
h1.add("b");
h1.add("c");
h1.add("d");
h1.add("z");

		
h1.add(null);
h1.add(10);
h1.add("z");
System.out.println(h1);
	}

}
