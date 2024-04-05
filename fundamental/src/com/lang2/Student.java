package com.lang2;

public class Student {

	String name;
	int rollno;
	Student(String name,int rollno)
	{this.name=name;
	this.rollno=rollno;
		
	}
	public int hashCode()
	{
		return 100;
	}

	/*
	 * public String toString() { return name + "..........." + rollno; }
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student("saicharan",101);
		Student s2=new Student("saicharan",101);
		//System.out.println(s1);
		//System.out.println(s1.toString());
		//System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s1);
		System.out.println(s2.hashCode());
		System.out.println(s2);
	}

}
