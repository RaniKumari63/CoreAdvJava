package com.java8;

public interface ShapeFactory {
Shape getShape(int x);
}
class Shape
{
	int x;
	public Shape(int x)
	{super();
	this.x=x;
	
		
	}
	void area() {
		System.out.println("Area"+x*x);
	}
}

