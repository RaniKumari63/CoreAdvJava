package com.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.JComboBox.KeySelectionManager;

public class HashMapEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> map=new HashMap<Integer,String>();
System.out.println("map"+map);
map.put(100,"Amit");
map.put(101, "vijay");
map.put(102,"Rahul");
String value=map.get(101);
System.out.println(value);
Set<Integer>keySet=map.keySet();
for(Integer i:keySet)
{
	System.out.println(i);
}
Collection<String> values=map.values();
for(Iterator iterator=values.iterator();iterator.hasNext();)
{
	String string=(String)iterator.next();
	System.out.println(string);
}

for(Map.Entry m:map.entrySet())
{System.out.println(m.getKey()+""+m.getValue());
	
}
map.putIfAbsent(103,"gaurav");
	
for(Map.Entry m:map.entrySet())
{System.out.println(m.getKey()+""+m.getValue());
	
}

HashMap<Integer,String> map1=new HashMap<Integer,String>();  
map1.put(104,"Ravi");  
map1.putAll(map);  
System.out.println("After invoking putAll() method ");  
map1.remove(103, "gaurav");
for(Map.Entry m:map1.entrySet()){    
     System.out.println(m.getKey()+" "+m.getValue());    
    }


map1.remove(104);
for(Integer  s:map1.keySet())
{
	System.out.println("\t"+s.intValue());   
}
map1.clear();
System.out.println(map1.isEmpty());
	
	
HashMap<Integer,String> map2=new HashMap<Integer,String>();//Creating HashMap    
map2.put(1,"Mango");  //Put elements in Map  
map2.put(2,"Apple");    
map2.put(3,"Banana");   
map2.put(4,"Grapes");   
map2.put(1,"Grapes"); //trying duplicate key   
System.out.println("Iterating Hashmap...");  
for(Map.Entry m : map2.entrySet()){    
 System.out.println(m.getKey()+" "+m.getValue());    
}
map2.replace(4, "oranges");
map2.replace(3, "Banana", "Cherry");
	
for(Map.Entry m : map2.entrySet()){    
	 System.out.println(m.getKey()+" "+m.getValue());    
	}}

}
