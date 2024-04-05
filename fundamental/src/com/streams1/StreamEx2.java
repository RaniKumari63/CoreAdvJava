package com.streams1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> marks=new ArrayList<>();
marks.add(10);
marks.add(25);
marks.add(2);
marks.add(5);
marks.add(7);
marks.add(11);
System.out.println(marks);
Stream<Integer> updatemarks=marks.stream().map(i->i+5);
updatemarks.forEach(e->System.out.println(e));
//updatemarks.forEach(System.out::println);


Stream<Integer> updatemarks1=marks.stream().map(i->i+5).filter(i->i>35);
//updatemarks.forEach(e->System.out.println(e));
updatemarks1.forEach(System.out::println);


List<Integer> updatemarks2=marks.stream().map(i->i+5).filter(i->i>35).collect(Collectors.toList());
//updatemarks.forEach(e->System.out.println(e));

updatemarks2.stream().forEachOrdered(System.out::println);
Set<Integer> updatemarks3=marks.stream().map(i->i+5).filter(i->i>35).collect(Collectors.toSet());
updatemarks3.forEach(e->System.out.println(e));
updatemarks3.stream().forEachOrdered(System.out::println);

HashSet<Integer> hs=new HashSet(marks);
hs.forEach(e->System.out.println(e));

Stream<Integer> map1=marks.stream().map(i->i+10);
Set<Integer> set1=map1.collect(Collectors.toSet());
set1.stream().forEachOrdered(System.out::println);



	}

}
