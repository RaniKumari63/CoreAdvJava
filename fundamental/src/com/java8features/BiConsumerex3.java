package com.java8features;

import java.util.ArrayList;
import java.util.function.BiConsumer;

class Employee9
{
	String name;
	double salary;
	public Employee9(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
}
public class BiConsumerex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Employee9>l=new ArrayList<Employee9>();
l.add(new Employee9("aaaaa",1000));
l.add(new Employee9("bbbbb",2000));
l.add(new Employee9("ccccc",3000));
l.add(new Employee9("ddddd",4000));
l.add(new Employee9("eeeee",5000));
l.add(new Employee9("fffff",6000));
l.add(new Employee9("ggggg",7000));
BiConsumer<Employee9,Double> c=(e,d)->e.salary=e.salary+d;
for(Employee9 e7:l)
{
	c.accept(e7, 500.0);
}
for(Employee9 e1:l)
{
	System.out.println("ffffffffffff"+e1.name);
	System.out.println("ggggggggggggggggg"+e1.salary);
}
	}

}
