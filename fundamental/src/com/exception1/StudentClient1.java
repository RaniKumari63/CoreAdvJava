package com.exception1;

import java.util.Scanner;

public class StudentClient1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student rollno");
		int rollno=sc.nextInt();
		System.out.println("Enter student name");
		String name=sc.next();
		System.out.println("Enter student age");
		int age=sc.nextInt();
		System.out.println("Enter student course");
		String course=sc.next();
		try
		{
			System.out.println("Enter student marks");
			int marks=sc.nextInt();
			if(marks>100) 
				throw new MarkOutOfBoundsException();
			Student s1=new Student(rollno,name,age,course,marks);
			System.out.println("detailed entered successfully");
		}
		catch(MarkOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
