package com.java8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class MyComparator implements Comparator<Integer>
{
	public int compare(Integer i1,Integer i2)
	{ //descending comparator
		if(i1>i2)
		{
			return -1;
		}
		else if(i1<i2)
		{
			return 1;
			
		}
		else
		{
			return 0;
		}
	}
}
class MyComparator2 implements Comparator<Integer>
{
	public int compare(Integer i1,Integer i2)
	{ //descending comparator
		int value=(i1>i2)?-1:(i1<i2)?1:0;
		return value;
	}
}
class MyComparator1 implements Comparator<Integer>
{
	public int compare(Integer i1,Integer i2)
	{ //Ascending comparator
		if(i1>i2)
		{
			return 1;
		}
		else if(i1<i2)
		{
			return -1;
			
		}
		else
		{
			return 0;
		}
	}
}


public class SortingLamdaex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<Integer> l=new ArrayList<Integer>();
 l.add(10);
 l.add(0);
 l.add(15);
 l.add(5);
 l.add(20);
 System.out.println(l);
 MyComparator mc=new MyComparator();
 Collections.sort(l,mc);
 System.out.println(l);
 MyComparator1 mc1=new MyComparator1();
 Collections.sort(l,mc1);
 System.out.println(l);
 MyComparator2 mc2=new MyComparator2();
 
 Collections.sort(l,mc2);
 System.out.println(l);
 Collections.sort(l,(i1,i2)->(i1>i2?-1:(i1<i2)?1:0));
 System.out.println(l);
	}

}
