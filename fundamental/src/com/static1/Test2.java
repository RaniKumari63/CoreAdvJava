package com.static1;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a1=new A();
System.out.println(a1.i+" "+a1.j);
a1.i=a1.i+1;
a1.j=a1.j+1;
System.out.println(a1.i+" "+a1.j);
A a2=new A();
System.out.println(a2.i+" "+a2.j);
a2.i=a2.i+1;
a2.j=a2.j+1;
System.out.println(a1.i+" "+a1.j);
System.out.println(a2.i+" "+a2.j);
A a3=new A();
System.out.println(a3.i+" "+a3.j);
a3.i=a3.i+1;
a3.j=a3.j+1;
System.out.println(a1.i+" "+a1.j);
System.out.println(a2.i+" "+a2.j);
System.out.println(a3.i+" "+a3.j);
	}

}
