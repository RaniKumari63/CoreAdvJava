package com.lang2;

public class Student4 {
	String name;
	int rollno;
	Student4(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student4 s1=new Student4("rani",88);
Student4 s2=new Student4("kumari",88);
Student4 s3=new Student4("rani",88);
Student4 s4=s1;
String str1=new String("rani");
String str2=new String("kumari");
String str3=new String("rani");

StringBuffer sb1=new StringBuffer("ashok");
StringBuffer sb2=new StringBuffer("ashok");

System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));
System.out.println(sb1.equals(sb2));



System.out.println(str1.equals(str2));
System.out.println(str1.equals(str3));

	}

}
