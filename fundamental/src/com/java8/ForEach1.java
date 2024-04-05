package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach1 {

	public static void main(String args[])
	{
		List<Integer> values=Arrays.asList(4,5,6,7,8);
		
		for(Integer i:values)
		{
			System.out.println(i);
			
		}
		values.forEach(i->
		{System.out.println(i);
		
		System.out.println("fffffffffff");	
		});
		List<String>list=Arrays.asList("Alex","Brain","Charles");
		list.forEach(i->System.out.println(i));
		
		Map<String,String>map=Map.of("A","Alex","B","Brain","C","Charles");
		map.forEach((k,v)->
		{
		System.out.println("key="+k);
		System.out.println("value"+v);
		});
		
		Map<String,String>map1=Map.of("a","aaa","b","bbb","c","ccc","d","ddd");
		
		map1.forEach((k,v)->
		
		{
			System.out.println(k);
			System.out.println(v);
		}
				);
		
		
		
		
		
		
		
		List<String> items=new ArrayList<>();
		
		items.add("coins");
		items.add("pens");
		items.add("keys");
		items.add("sheets");
		
		items.forEach(i->{
			System.out.println(i);
		          
		
		});
		
		
		Map<String,Integer> items1=new HashMap<>();
		
		items1.put("coins",3);
		items1.put("pens", 2);
		items1.put("keys", 1);
		items1.put("sheets", 12);
		items1.forEach((k,v)->{
			System.out.println(k);
			
			System.out.println(v);
		});
	}
}
