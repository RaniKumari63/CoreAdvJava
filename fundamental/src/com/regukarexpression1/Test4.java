package com.regukarexpression1;

import java.util.regex.Pattern;


public class Test4 {
public static void main(String args[])
{
	System.out.println(Pattern.matches("[a-zA-Z0-9]", "0"));
	System.out.println(Pattern.matches("[a-zA-Z0-9]", "a"));
	System.out.println(Pattern.matches("[a-zA-Z0-9]", "A"));
	System.out.println(Pattern.matches("[0-9]", "0"));
	System.out.println(Pattern.matches("\\d", "0"));
	
	System.out.println(Pattern.matches("\\d[a-z]", "9a"));
	System.out.println(Pattern.matches("\s","a"));
	System.out.println(Pattern.matches("[a-z]", "a"));
	
	System.out.println(Pattern.matches("[A-Z]", "A"));
	System.out.println(Pattern.matches("[abc]", "a"));
	System.out.println(Pattern.matches("[abc]", "a"));
	System.out.println(Pattern.matches("[abc]", "b"));
	System.out.println(Pattern.matches("[abc]", "c"));
	System.out.println(Pattern.matches("[^abc]", "a"));
	System.out.println(Pattern.matches("\\w", "a"));
	System.out.println(Pattern.matches(".", "a"));
	System.out.println(Pattern.matches(".", "&"));
	System.out.println(Pattern.matches("a", "aa"));
	System.out.println(Pattern.matches("a", "a"));
	System.out.println(Pattern.matches("a+", "aaaaa"));
	System.out.println(Pattern.matches("a*", ""));
	System.out.println(Pattern.matches("a?", ""));
	
	
	//1
	//rule:the length of each identifier is atleast 2
	//allowed character are a-z A-Z 0 to 9 ._
	//the first character should not digit
	//[a-zA-Z._][a-zA-Z0-9._]*
	
	
	//2
	//all mobile numbers
	//mobile no contains 10 digits
	//the first digit should be 7 to 9
	//[7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]
	//[7-9][0-9]{9}
	//[7-9]\\d{9}
	
	
	//3
	//0 to 9 a-z A-Z
	//should start with aplhabet symbol
	//shoud contain atleast one symbolll
	//[a-zA-Z][a-zA-Z0-9._]*@[a-zA-Z0-9]+([.][a-zA-Z]*)
}
}