package com.collections;

import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v=new Vector();
System.out.println(v.capacity());
for(int i=1;i<10;i++)
{
v.addElement(i);	
}
v.addElement("A");

	}

}
