package com.java8;

import java.util.ArrayList;

interface A
{
	void show(int i);
	
}

/*
 * class Xyz implements A { public void show() { System.out.println("Hello"); }
 * public void add(int x,int y) { System.out.println(x+y); } }
 */
public class LamdaExpression1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * A obj; obj=new Xyz(); obj.show(); obj.add(10, 20);
		 */
		
		A obj1=new A()
				{
			public void show(int i)
			{
				System.out.println("Haiiiiii");
			}
		
			
				};
				obj1.show(10);
				
				
			A obj2=i->System.out.println("hhhh"+i);
	
			
			ArrayList<Integer> numbers=new ArrayList<Integer>();
			 numbers.add(5);
			    numbers.add(9);
			    numbers.add(8);
			    numbers.add(1);
			    numbers.forEach(i->System.out.println(i));
			}
	}


