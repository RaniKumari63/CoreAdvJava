package com.java8features;

import java.util.Arrays;
import java.util.List;

public class ForEachEx1 {
public static void main(String args[])
{

	
	List<Integer> values=Arrays.asList(4,5,6,7,8);

	//External loops
	for(int i=0;i<values.size();i++)
{
	System.out.println(values.get(i));
}
//External Loops
for(int i:values)
{
	System.out.println(i);
}

//Internal Loops
values.forEach(j->System.out.println(j));
	
	


}
}
