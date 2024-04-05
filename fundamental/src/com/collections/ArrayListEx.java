package com.collections;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();
al.add(100);
al.add(250);
al.add(365);
al.add(125);
al.add("shiva");
al.add(null);
System.out.println(al);
al.add(1,260);
Object obj=al.get(1);
System.out.println(al);
double sfee=(Double)obj;
System.out.println(sfee);
for(int i=0;i<al.size();++i)
{
Object obj1=al.get(i);
System.out.println(obj1);
}
for(Object ob:al)
{
	System.out.println(ob);
}
	}

}
