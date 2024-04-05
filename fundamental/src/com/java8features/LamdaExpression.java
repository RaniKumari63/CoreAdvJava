package com.java8features;
interface Aa
{
	void show(int i);
}
/*class Xyz implements Aa
{
public void show()
{
	System.out.println("Hello");
}
}*/
public class LamdaExpression {
public static void main(String[] args)
{
	Aa obj;
	obj=new Aa()
			{
		
		
		public void show(int i)
		{
			System.out.println("Hello"+i);
		}
			};
	obj.show(6);
	
	
	
	Aa obj1;
	obj1= i->{
			System.out.println("Hello"+i);
		}
		;
	obj1.show(7);
	
	
	Aa obj2;
	obj2= i->
			System.out.println("Hello"+i);
		
		;
	obj2.show(8);
	
}
	
}
