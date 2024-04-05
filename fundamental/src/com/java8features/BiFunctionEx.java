package com.java8features;

import java.util.ArrayList;
import java.util.function.BiFunction;

class Employee8{
	
	int eno;
	String name;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee8(int eno, String name) {
		super();
		this.eno = eno;
		this.name = name;
	}
	
}
public class BiFunctionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BiFunction<Integer,String,Employee8> e=(eno,ename)->new Employee8(eno,ename);
Employee8 e1=e.apply(100, "durga");

ArrayList<Employee8> l=new ArrayList<Employee8>();	
l.add(e.apply(100, "aaaaaaa"));
l.add(e.apply(200, "bbbbbbb"));
l.add(e.apply(300, "ccccccc"));
l.add(e.apply(400, "ddddddd"));
l.add(e.apply(500, "eeeeeee"));
l.add(e.apply(600, "ffffff`"));
for(Employee8 ev:l)
{
	System.out.println(ev.eno);
}

	
	}

}
