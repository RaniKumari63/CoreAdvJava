package com.streams1;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> evennum=new ArrayList<>();
evennum.add(10);
evennum.add(25);
evennum.add(2);
evennum.add(5);
evennum.add(7);
evennum.add(11);
System.out.println(evennum);
evennum.forEach(i->{
	if(i%2==0)
		System.out.println(i);
	
});


Stream<Integer>stream=evennum.stream().filter(i->i%2==0);
stream.forEach(e->System.out.println(e));

Stream<Integer> evenex=evennum.stream().filter(i->i%2==0);
evenex.forEach(e->System.out.println(e));

Stream<Integer> greaterf=evennum.stream().filter(i->i>5);
greaterf.forEach(e->System.out.println(e));
	}

}
