package com.streams1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> l=new ArrayList<String>();
l.add("aaaaa");
l.add("bbbbnnn");
l.add("cccc");
l.add("ddddkkkk");
l.add("eeeennn");
l.add("ffff");
l.add("gggg");
l.add("hhhh");
l.add("iiii");

Comparator<String> c=(s1,s2)->{
	int l1=s1.length();
	int l2=s2.length();
	if(l1<l2) return -1;
	else if(l1>l2) return +1;
	else return s1.compareTo(s2);
};

List<String> sortedallstudents1=l.stream().sorted((s1,s2)->s1.compareTo(s2)).toList();
System.out.println(sortedallstudents1);
List<String> sortedallstudents2=l.stream().sorted(c).toList();
System.out.println(sortedallstudents2);


	}

}
