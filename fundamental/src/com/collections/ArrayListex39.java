package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al =new ArrayList<String>();
		al.add("ratan");
		al.add("anu");
		al.add("sravya");
		
		for (String a : al )
		{ System.out.println(a);
		}
		int size = al.size();
		for (int i=0;i<size;i++)
		{ System.out.println(al.get(i));
		}
		Iterator itr1 = al.iterator(); 
		while (itr1.hasNext())
		{ String str =(String)itr1.next(); 
		System.out.println(str);
		}
		Iterator<String> itr2 = al.iterator(); 
		while (itr2.hasNext())
		{ String str =itr2.next(); 
		System.out.println(str);
		}

	}

}
