package com.java8features;

import java.util.ArrayList;
import java.util.function.Predicate;
class Employee
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
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
}
public class Test15 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Employee> a1=new ArrayList<Employee>();
	a1.add(new Employee("shiva",2500));
	a1.add(new Employee("rani",3500));
	a1.add(new Employee("lilly",4500));
	a1.add(new Employee("malli",5500));
	a1.add(new Employee("aaaa",6500));
	a1.add(new Employee("bbbb",7500));
	
	for(Employee emp:a1)
	{
		if(emp.salary>3000)
		{
			System.out.println(emp.name+"\t"+emp.getName());
		}
		
	}
	
	//Predicate<ArrayList>
	
	}

}
