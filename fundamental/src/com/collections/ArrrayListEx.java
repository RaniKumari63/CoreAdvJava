package com.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class ArrrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Resizable array or growable array
		//Duplicate 
		//insertion order is preserved
		//heterogenous object are allowed
		//null insertion is possible
		//
		ArrayList l=new ArrayList();
		ArrayList l1=new ArrayList(30);
		
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
		l.add(2,"M");
		l.add("N");
		System.out.println(l);
		ArrayList l3=new ArrayList();
		LinkedList l4=new LinkedList();
		System.out.println(l3 instanceof Serializable );
		System.out.println(l4 instanceof Cloneable );
		System.out.println(l3 instanceof RandomAccess );
		System.out.println(l4 instanceof RandomAccess );
		ArrayList l5=new ArrayList();
		List l9=Collections.synchronizedList(l5);
		
		
		
	}

}
