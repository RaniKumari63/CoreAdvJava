package com.streams1;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class ForEachEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> l1=new ArrayList<Integer>();
l1.add(10);
l1.add(0);
l1.add(15);
l1.add(5);
l1.add(20);
System.out.println(l1);
l1.stream().forEach(System.out::println);
Consumer<Integer> f=i->{
	System.out.println("The Square of "+i+"is:"+(i*i));
};
	
l1.stream().forEach(f);

l1.stream().forEach(i->{
	System.out.println("The Square of "+i+"is:"+(i*i));
});

Integer[] l2= l1.stream().toArray(Integer[]::new);
	for(Integer i1:l2)
	{
		System.out.println(i1);
	}
	Stream.of(l2).forEach(System.out::println);;
	
	Stream ss=Stream.of(9,99,999,9999,99999);
	ss.forEach(System.out::println);
	Integer[] i= {10,20,30,40,50};
	Stream.of(i).forEach(System.out::println);
	}

}
