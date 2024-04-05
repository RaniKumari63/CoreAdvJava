package com.innerclass1;
abstract class Person
{
	abstract void eat();
}
public class TestAnonymousInner {
	public static void main(String args[])
	{
		Person p=new Person()
				{

					@Override
					void eat() {
						// TODO Auto-generated method stub
						System.out.println("nice fruits");
					}
			
				};
				p.eat();
				System.out.println(p.getClass());
				Person p1=new Person()
				{

					@Override
					void eat() {
						// TODO Auto-generated method stub
						System.out.println("nice nnnnfruits");
					}
			
				};
				p1.eat();
				System.out.println(p1.getClass());
	}

}
