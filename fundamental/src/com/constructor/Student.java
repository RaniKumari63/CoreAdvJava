package com.constructor;

public class Student {

	String name;
	int rollno;
	
	public Student(String name, int rollno) {
			this.name = name;
		this.rollno = rollno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Student s=new Student();
		Student s1=new Student("rani",101);
		Student s2=new Student("kumari",102);
	}

}
