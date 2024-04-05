package com.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LinkedList l=new LinkedList();
  l.add("baala");
  l.add("venku");	
  l.add("chiru");
  l.add("naag");
  System.out.println(l);
  ListIterator ltr=l.listIterator();
		  
		  while(ltr.hasNext()) {
			  String s = (String)ltr.next();
			  if(s.equals("Venki"))
			  ltr.remove();
			  if(s.equals("Naag"))
			  ltr.add("Chaitu");
			  if(s.equals("Chiru"))
			  ltr.add("Charan");
			  }
			  System.out.println(l);

	}

}
