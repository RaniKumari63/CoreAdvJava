package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list1=new ArrayList();
List<Integer> list2=new LinkedList();
List<Integer> list3=new Vector();
List<Integer> list4=new Stack();

ArrayList<String> list=new ArrayList<String>();
list.add("Ravi");
list.add("Vijay");
list.add("Ravi");
list.add("Ajay");

Iterator itr=list.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	
	LinkedList<String> al=new LinkedList<String>();
	al.add("Ravi");
	al.add("Vijay");
	al.add("Ravi");
	al.add("Ajay");
	
	Iterator<String> itr1=al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
	
	Set<> s1=new HashSet<>
	
	}

}
