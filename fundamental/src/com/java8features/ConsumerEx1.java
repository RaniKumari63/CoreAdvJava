package com.java8features;

import java.util.function.Consumer;

public class ConsumerEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Consumer<String>c=s->System.out.println(s);
c.accept("rani");
c.accept("sirirsha");
Consumer<Student1>stu=s1->
{
	System.out.println(s1.getSname());
	System.out.println(s1.getMarks());
};
	}

}
