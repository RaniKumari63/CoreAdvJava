package com.java8;

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShapeFactory factory=(x)->
		{
			return new Shape(x);
		};
		
		ShapeFactory factory1=Shape::new;
		factory.getShape(10);
	}

}
