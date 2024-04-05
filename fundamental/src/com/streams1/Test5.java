package com.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> strList=Arrays.asList("shiva","sirisha","rani","lilly","");
long count=strList.stream().filter(x->x.isEmpty()).count();
long count2=strList.stream().filter(x->x.length()>3).count();
System.out.println(count2);
long count3=strList.stream().filter(x->x.startsWith("s")).count();
System.out.println(count3);
List<String> filtered=strList.stream().filter(x->!x.isEmpty())
.collect(Collectors.toList());
	}

}
