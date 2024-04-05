package com.collections;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMapEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.put(100, "Amit");
map.put(101, "Vijay");
map.put(102, "Rahul");
map.put(103,"Rani");
map.put(104,"fff");	
map.remove(104);	

	for(Map.Entry m:map.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());    
	}
	
	System.out.println("keys:"+map.keySet());
	System.out.println("Values: "+map.values());  
	 System.out.println("Key-Value pairs: "+map.entrySet());  
	}
}
