package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> map=new HashMap<Integer,String>();
map.put(1,"Mango");
map.put(2, "Apple");
map.put(3,"Banana");
map.put(1,"grapes");
for(Map.Entry m:map.entrySet())
{System.out.println(m.getKey()+""+m.getValue());
	
}
	}

}
