package com.innerclass1;
 interface Person1
{
	 void eat();
}
public class TestAnonymousInner2 {
	public static void main(String args[])
	{
		Person1 p=new Person1()
				{

					@Override
					public
					void eat() {
						// TODO Auto-generated method stub
						System.out.println("nice fruits");
					}
			
				};
				p.eat();
				System.out.println(p.getClass());
				Person1 p1=new Person1()
				{

					@Override
					public
					void eat() {
						// TODO Auto-generated method stub
						System.out.println("nice nnnnfruits");
					}
			
				};
				p1.eat();
				System.out.println(p1.getClass());
	}

}
