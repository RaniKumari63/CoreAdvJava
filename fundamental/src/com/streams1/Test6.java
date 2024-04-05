package com.streams1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(5);
		al.add(4);
		al.add(3);
		al.add(2);
		al.add(1);
		
System.out.println(al);
Comparator<Integer> c=(i1,i2)->(i1>i2)?-1:(i1<i2)?1:0;
Collections.sort(al,c);
al.forEach(System.out::println);
Collections.sort(al,new Comparator()
		{
	public int compare(Object o1,Object o2)
	{
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		return i2.compareTo(i1);
	}
	
		});
al.forEach(System.out::println);
Collections.sort(al,(i1,i2)->i2.compareTo(i1));

al.forEach(System.out::println);
al.stream().collect(Collectors.toSet()).forEach(e->System.out.println(e));

	}

}
