package com.collections;

import java.util.ArrayList;

public class ListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList();
		al.add(0, "a");
		al.add(1,"b");
		al.add(2,"c");
		System.out.println(al.get(0));
		System.out.println(al.remove(0));
		System.out.println(al);
		al.set(0, "bb");
		System.out.println(al);
		System.out.println(al.indexOf(al));
		System.out.println(al.lastIndexOf(al));
		
		
	}

}
