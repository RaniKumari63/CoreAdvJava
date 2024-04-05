package com.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Test77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> number = Arrays.asList(2,3,4,5);
		 List<Integer> square = number.stream().map(x -> x*x).
                 collect(Collectors.toList());
System.out.println(square);
List<String> names =Arrays.asList("Reflection","Collection","Stream");
System.out.println(names);
List<String> result=names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
	
	System.out.println(result);
List<String> show=names.stream().sorted().collect(Collectors.toList());
	System.out.println(show);
	
	}

}
