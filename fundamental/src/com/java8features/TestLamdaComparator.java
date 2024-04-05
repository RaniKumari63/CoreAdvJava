package com.java8features;

import java.util.ArrayList;
import java.util.Collections;

class Employee123
{
	int eno;
	String ename;
	Employee123(int eno,String ename)
	{
		this.eno=eno;
		this.ename=ename;
	}
	@Override
	public String toString() {
		return eno+":"+ename;
	}
}
public class TestLamdaComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Employee123> l=new ArrayList<Employee123>();
l.add(new Employee123(200,"aaa"));
l.add(new Employee123(400,"bbb"));
l.add(new Employee123(300,"ccc"));
l.add(new Employee123(600,"ddd"));
l.add(new Employee123(267800,"eee"));
l.add(new Employee123(345,"fff"));
System.out.println(l);
Collections.sort(l,(e1,e2)->(e1.eno<e2.eno?-1:(e1.eno<e2.eno)?1:0));
System.out.println(l);
	}

}
