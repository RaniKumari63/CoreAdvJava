package com.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class HashIndentity {

	public static void main(String[] args) {
		Integer i=new Integer(10);
		Integer i1=new Integer(10);
		// TODO Auto-generated method stub
		HashMap<Integer,String> h = new HashMap<Integer,String>();
		h.put(i,"ratan");
		h.put(i1,"anu");
		System.out.println(h);
		
		IdentityHashMap<Integer,String> h1 = new IdentityHashMap<Integer,String>();
		h1.put(i,"ratan");
		h1.put(i1,"anu");
		System.out.println(h1);
	}

}
