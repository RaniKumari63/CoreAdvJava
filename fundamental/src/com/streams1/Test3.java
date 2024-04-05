package com.streams1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> l=new ArrayList<Integer>();
l.add(10);

l.add(0);
l.add(15);
l.add(50);
l.add(50);
l.add(10);
l.add(20);
System.out.println(l);
Integer minn=l.stream().min((i1,i2)->i1.compareTo(i2)).get();

System.out.println(minn);
Integer maxx=l.stream().max((i1,i2)->-i1.compareTo(i2)).get();

System.out.println(maxx);

	}

}
