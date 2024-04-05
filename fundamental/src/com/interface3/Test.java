package com.interface3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child ch=new GrandChild();
ch.qualities();
ch.sleeping();
ch.smoking();
ch.sports();
System.out.println(Father.i);
System.out.println(Child.i);
System.out.println(GrandChild.i);
//ch.i;
	}

}
