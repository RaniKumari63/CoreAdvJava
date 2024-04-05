package com.collections;

import java.util.HashMap;
import java.util.WeakHashMap;

public class HashWeak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap h = new HashMap();
		A a= new A();
		h.put(a,"ratan");
		System.out.println(h);
		a=null;
		System.gc();
		System.out.println(h);
		WeakHashMap h1 = new WeakHashMap();
		A a1= new A();
		h1.put(a,"ratan");
		System.out.println(h1);
		a1=null;
		System.gc();
		System.out.println(h1);

	}

}
class A
{ public String toString()
{ return "A";
}
public void finalize()
{System.out.println("object destroyed");
}
}