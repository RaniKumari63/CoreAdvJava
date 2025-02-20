package com.java8features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class Student1
{
	String sname;
	int marks;
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(String sname, int marks) {
		super();
		this.sname = sname;
		this.marks = marks;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
}
public class FunctionInterface1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Student1,String> f=s->
		{
			int marks=s.marks;
			String grade="";
			if(marks>=90)
				grade="A grade";
			else if(marks>60)
				grade="B grade";
			else if(marks>50)
				grade="d grade";
			else 
				grade="failed";
			return grade;
				
		};

		Predicate <Student1> p1=p->p.marks>60;
		Consumer<Student1> c=s1->
		{
			System.out.println(s1.getSname()+"\t"+s1.getMarks()+"\t"+f.apply(s1));
		};
		Student1[] stu= {new Student1("rani",90),new Student1("malli",60),new Student1("akash",55)};
for(Student1 s1:stu)
{
	if(p1.test(s1))
	{
		c.accept(s1);
	}
}
	}

}
