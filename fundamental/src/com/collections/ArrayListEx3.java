package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Student stu=new Student(100,"rani","hyd");
	Student stu1=new Student(101,"ravi","viz");
	Student stu2=new Student(102,"kumari","gun");
	Student stu3=new Student(103,"yaswanth","hyd");
	Student stu4=new Student(104,"rani","hyd");
	
	ArrayList<Student>addRecords=new ArrayList<Student>();
	addRecords.add(stu1);
	addRecords.add(stu2);
	addRecords.add(stu3);
	addRecords.add(stu4);
	for(Student s:addRecords)
	{
	System.out.println(s.getSno()+"\t"+s.getSname()+"\t"+s.getSaddr());	
	}
	
	System.out.println("Display Specific Record");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Student number");
	int no=sc.nextInt();
	int k=0;
	for(Student s:addRecords)
	{
		if(s.getSno()==no)
		{
			++k;
		}
	}
	
	ArrayList l=new ArrayList();
	l.add("vijaya");
	l.add("bhaskara");
	l.add(new Integer(10));
	String name1=(String)l.get(0);
	String name2=(String)l.get(1);
	//String name3=(String)l.get(2);
	}

}
