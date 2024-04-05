package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count[]= {34,22,10,60,30,22};
Set<Integer> set=new HashSet<Integer>();


	for(int i=0;i<5;i++)
		 set.add(count[i]);
	System.out.println(set);
	TreeSet<Integer> sortedSet=new TreeSet<Integer>(set);
	System.out.println("The sorted list is:");
    System.out.println(sortedSet);

    System.out.println("The First element of the set is: "+ (Integer)sortedSet.first());
    System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());
	
	HashSet<Integer> hset=new HashSet<Integer>();
	hset.add(null);
	
	hset.add(1);
	hset.add(null);
	System.out.println(hset);
	
	HashSet<String> set1=new HashSet<String>();
	set1.add("one");
	set1.add("two");
	set1.add("three");
	set1.add("four");
	set1.add("five");
	Iterator<String> i=set1.iterator();
	while(i.hasNext())
	{
			System.out.println(i.next());
		
	}
	HashSet<String> set6=new HashSet<String>();
	set6.add("ravi");
	set6.add("vijay");
	set6.add("arun");
	set6.add("ravi");
	set6.add("ajay");
	set6.add("gaurav");
	System.out.println("set6"+set6);
	set6.remove("ravi");
	System.out.println("set6"+set6);
	Iterator<String> itr1=set6.iterator();
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());
	}
	
	HashSet<String> set7=new HashSet<String>();
	set7.add("Ajay");
	set7.add("Gaurav");
	set6.addAll(set7);
	System.out.println(set6);
	set6.removeIf(str->str.contains("vijay"));
	set6.clear();
	System.out.println(set6);
	
	ArrayList<String> list=new ArrayList<String>();  
    list.add("Ravi");  
    list.add("Vijay");  
    list.add("Ajay");  
      
    HashSet<String> set8=new HashSet(list);  
    set8.add("Gaurav");  
    Iterator<String> i7=set8.iterator();  
    while(i7.hasNext())  
    {  
    System.out.println(i7.next());  
    }  
	
	}

	
	
}
