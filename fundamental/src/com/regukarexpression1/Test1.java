package com.regukarexpression1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
  Pattern p=Pattern.compile("ab");//pattern
  Matcher m=p.matcher("ababbaba");//target string
  while(m.find())
  {
	  count++;
	 System.out.println(m.start()+".............."+m.end()+"........"+m.group()); 
	 System.out.println("the number of occurences"+count);
  }
	}

}
