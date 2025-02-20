package com.java8features;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee1{
	String name;
	double salary;
	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee1(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
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
}

public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee1> a1=new ArrayList<Employee1>();
		a1.add(new Employee1("shiva",2500));
		a1.add(new Employee1("rani",3500));
		a1.add(new Employee1("lilly",3500));
		a1.add(new Employee1("aaaa",4500));
		a1.add(new Employee1("bbbb",5500));
		a1.add(new Employee1("cccc",6500));
		for(Employee1 emp:a1)
		{
			if(emp.salary>3000)
			{
				System.out.println(emp.name+"\t"+emp.salary);
			}
		}
		
		
		Predicate<Employee1> p2=e->e.salary>3000;
		for(Employee1 emp:a1)
		{
			if(p2.test(emp))
			{
				System.out.println(emp.name+"\t"+emp.salary);
			}
		}
		
	}

}
