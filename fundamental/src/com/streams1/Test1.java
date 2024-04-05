package com.streams1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> marks=new ArrayList<Integer>();
marks.add(20);
marks.add(35);
marks.add(60);
marks.add(70);
marks.add(30);
marks.add(80);
List<Integer> updatedmarks=marks.stream().filter(ma->ma>=35).collect(Collectors.toList());
System.out.println(updatedmarks);
long nooffailedstudents=marks.stream().filter(m1->m1<35).count();
long allstudents=marks.stream().count();
System.out.println(allstudents);
System.out.println(nooffailedstudents);
List<Integer> sortedallstudents=marks.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
System.out.println(sortedallstudents);


List<Integer> sortedallstudents1=marks.stream().sorted((i1,i2)->(-i1.compareTo(i2))).collect(Collectors.toList());
System.out.println(sortedallstudents1);

List<Integer> sortedallstudents2=marks.stream().sorted((i1,i2)->(i2.compareTo(i1))).collect(Collectors.toList());
System.out.println(sortedallstudents2);
	}

}
