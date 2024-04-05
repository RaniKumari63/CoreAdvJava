package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Concurrentmodification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		Iterator itr = al.iterator();
		while (itr.hasNext()){
		String s = (String)itr.next();
		System.out.println(s);
		al.add("D");
		}
		}
	}