package com.java8features;

import java.util.ArrayList;
import java.util.function.Predicate;
class Employee1
{
	String name;
	double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee1(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
public class Test133 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] s= {"Nag","Chiranjeevi","Venkatesh","Balaiah","Sunny","Katrina"};
	
	Predicate<String>p=s1->s1.length()%2==0;
	for(String s1:s)
	{
		if(p.test(s1))
		{
			System.out.println(s1);
		}
	}
	
	
	ArrayList<Employee1> l=new ArrayList<Employee1>();
	l.add(new Employee1("durga",10000)); 
	l.add(new Employee1("aaaa",20000));
	l.add(new Employee1("bbbb",30000));
	l.add(new Employee1("cccc",40000));
	l.add(new Employee1("dddd",50000));
	l.add(new Employee1("eeee",60000));
	l.add(new Employee1("ffff",70000));
	Predicate<Employee1> p1=e1->e1.salary>3000;
	for(Employee1 e2:l)
	{
		if(p1.test(e2))
		{
			System.out.println(e2.name+"\t"+e2.salary);
		}
	}
	
	}

}
