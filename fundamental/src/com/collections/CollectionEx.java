package com.collections;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a=new ArrayList();
a.add("a");
a.add("b");
a.add("c");
a.add("d");
a.add("e");
a.add("f");
ArrayList a1=new ArrayList();
a1.add("a1");
a1.add("b1");
a1.add("c1");
a1.add("d1");
a1.add("e1");
a1.add("f1");
a.addAll(a1);
a.remove("f");
//a.removeAll(a1);
System.out.println(a);
System.out.println(a1);
//a.retainAll(a1);
System.out.println(a);
//a.clear();
System.out.println(a);
System.out.println(a.contains("k"));
System.out.println(a.containsAll(a1));
System.out.println(a.isEmpty());
System.out.println(a.size());
Object[] str= a.toArray();
System.out.println(Arrays.toString(str));
	}

}
