package com.exception1;

import java.util.Scanner;

public class StudentClient {

	public static void main(String[] args)   {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student rollno");
		int rollno=sc.nextInt();
		System.out.println("Enter Student name");
		String name=sc.next();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println("Enter student course");
		String course=sc.next();
		Student s1=new Student(rollno,name,age,course);
		try {
		student_exception(s1);
		}
		catch(check_student_exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
public static void student_exception(Student st) throws check_student_exception
{
	int i;
	if(st.getAge()>=15&&st.getAge()<=21)
	{
		check_student_exception ck=new check_student_exception("Age not within range");
		
		throw ck;
	}
	
	for(i=0;i<st.getName().length();i++)
	{
		char c=st.getName().charAt(i);
		if(!Character.isLetter(c))
		{
			check_student_exception ck1=new check_student_exception("Name not Valid");
			throw ck1;
		}
		
	}


	
}
}
