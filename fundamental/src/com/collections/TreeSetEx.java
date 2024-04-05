package com.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> al=new TreeSet<String>();
		al.add("ravi");
		al.add("vijay");
		al.add("ravi");
		al.add("ajay");
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()){  
			   System.out.println(itr.next());  
			  } 
		
		  Iterator i=al.descendingIterator();  
	         while(i.hasNext())  
	         {  
	             System.out.println(i.next());  
	         }  
	         TreeSet<Integer> set=new TreeSet<Integer>();    
	         set.add(24);    
	         set.add(66);    
	         set.add(12);    
	         set.add(15);    
	         System.out.println("Lowest Value: "+set.pollFirst());    
	         System.out.println("Highest Value: "+set.pollLast());   
	}

}
