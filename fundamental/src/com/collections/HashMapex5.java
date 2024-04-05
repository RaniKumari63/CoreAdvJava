package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,String> map=new HashMap<Integer,String>();  
		    
		    map.put(1,"Amit");  
		    map.put(5,"Rahul");  
		    map.put(2,"Jai");  
		    map.put(6,"Amit");  
		    Set set=map.entrySet();
		    Iterator itr=set.iterator();
		 for(int i=0;i<map.entrySet().size();i++)
		 {
			System.out.println(set);
		 }
		   
		 for(Map.Entry m:map.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
			  }  
		 while(itr.hasNext())
		 {
			Map.Entry entry=(Map.Entry)itr.next();
			System.out.println(entry.getKey()+""+entry.getValue());
		 }
		
	}

}
