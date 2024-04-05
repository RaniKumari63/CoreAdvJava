package com.exception1;

import java.util.Scanner;

public class Student {

	private int rollono;
	private String name;
	private int age;
	String course;
	int marks;
	public Student(int rollono, String name, int age, String course) {
		super();
		this.rollono = rollono;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRollono() {
		return rollono;
	}
	public void setRollono(int rollono) {
		this.rollono = rollono;
	}
	public String getName() {
		return name;
	}
	public Student(int rollono, String name, int age, String course, int marks) {
		super();
		this.rollono = rollono;
		this.name = name;
		this.age = age;
		this.course = course;
		this.marks = marks;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	
	
	

}
