package com.innerclass1;

public class localInner2 {
	private int data=30;
	void display()
	{ int value=50;
		class Local
		{
			void msg()
			{
				System.out.println(data);
				System.out.println(value);
			}
		}
		Local l=new Local();
		l.msg();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		localInner2 obj=new localInner2();
		obj.display();
		obj.display();
	}

}
