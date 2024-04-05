package com.regukarexpression1;
import java.util.regex.*;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern p=Pattern.compile(".m");
Matcher m=p.matcher(".am");		
	Boolean b=m.matches();
	System.out.println(b);
	
	/*
	 * Boolean b1=Pattern.matches(".m",".am");
	 * System.out.println(Pattern.matches(".m",".am"));
	 * System.out.println(Pattern.matches("[amn]","a"));
	 * System.out.println(Pattern.matches("[^amn]","k"));
	 * System.out.println(Pattern.matches("[a-zA-Z]","c"));
	 * System.out.println(Pattern.matches("[MS][a-z]{5}","Monica"));
	 * System.out.println(Pattern.matches("[a-ds-u]","b"));
	 * System.out.println(Pattern.matches("[MS][a-z]{5}","Sameez"));
	 * System.out.println(Pattern.matches("[MS][a-z]{5}","Anand"));
	 * System.out.println(Pattern.matches("[amn]","acd")); System.out.println();
	 * System.out.println();
	 */
	
	/*
	 * 
	 * System.out.println(Pattern.matches("[xyz]?", "x"));
	 * System.out.println(Pattern.matches("[xyz]?", "xxyyyzz"));
	 * System.out.println(Pattern.matches("[xyz]?", "xxx"));
	 */
	System.out.println(Pattern.matches("[xyz]+", "x"));
	System.out.println(Pattern.matches("[xyz]+", "xxx"));
	System.out.println(Pattern.matches("[xyz]+", "xyyzz"));
	System.out.println(Pattern.matches("[xyz]*", "xyyydfa"));
	System.out.println(Pattern.matches("[xyz]*", "xxyz"));
	System.out.println(Pattern.matches("[xyz]*", "xxddd"));
	
	
	System.out.println(Pattern.matches("\\d", "1"));
	System.out.println(Pattern.matches("\\d", "1a"));
	System.out.println(Pattern.matches("\\D", "1"));
	System.out.println(Pattern.matches("\\D", "1a"));
	System.out.println(Pattern.matches("\\D", "a"));
	System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "monica"));
	}

}
