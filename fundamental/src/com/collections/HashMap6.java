package com.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,Book> map=new HashMap<Integer,Book>();
		
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
		Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
	    map.put(1, b1);
	    map.put(2, b2);
	    map.put(3, b3);
	    List l=new ArrayList();
	    l.add("rrr");
	    l.add("ddd");
	    l.add("555");
	    Map m=new HashMap();
	    m.put(101,"rrr");
	    m.put(102,"ddd");
	    
	    
	    
	    for(Map.Entry<Integer, Book> entry:map.entrySet())
	    {
	    	 int key=entry.getKey();  
	         Book b=entry.getValue();  
	         System.out.println(key+" Details:");  
	         System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
	    }
	}

}

