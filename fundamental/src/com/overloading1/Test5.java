package com.overloading1;

public class Test5 {

	 public void add(int x,int y)
	 {
		System.out.println(x+y); 
	 }
	 public void add(int x,int y,int z)
	 {System.out.println(x+y+z);
		 
	 }
	 public void display(String name,int sno)
	 {
		System.out.println(name+"\t"+sno); 
	 }
	 public void display(double sfee,String sno)
	 {
		System.out.println(sfee+"\t"+sno); 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test5 t=new Test5();
		t.add(100,200,300);
	}

}
