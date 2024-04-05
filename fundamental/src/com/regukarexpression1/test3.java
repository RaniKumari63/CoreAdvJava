package com.regukarexpression1;

import java.util.regex.Pattern;

public class test3 {
public static void main(String args[])
{
	System.out.println(Pattern.matches("agent\\d\\d\\d", "agent008"));
	System.out.println(Pattern.matches("agent\\d{3}", "agent008"));
	System.out.println(Pattern.matches("agent\\d{3,}", "agent008"));
	System.out.println(Pattern.matches("agent\\d{3,4"+ "}", "agent008"));
	System.out.println(Pattern.matches("agent\\d{3,4"+ "}", "agent008"));
	System.out.println(Pattern.matches("^agent\\d{3,4$"+ "}", "34343agent0085454"));

//"^agent[0-9]{3,4}$"
	//"^agent[0-8]{3,4}$"
	//"^agent\d{3,4}$"
	//"^.gent\d{3,4}$"
	//^[aA]gent\d{3,4}$
	//^(a|A|aa)gent\d{3,4}$
	//^[a|A]gent(\d{3,4})$
	
	
}
}
