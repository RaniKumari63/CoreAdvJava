package com.this1;
class Test99
{
	Test99(ThisDemo td)
	{
		System.out.println(td);
		
	}
	
}
public class ThisDemo {
  void m1(ThisDemo ti)
  {
	 System.out.println("m1 method"+ti); 
  }
  void m2()
  {
	  m1(this);
	  
  }
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo td=new ThisDemo();
		td.m2();
		System.out.println(td);
		Test99 t9=new Test99(td);
		System.out.println(t9);
		
	}

}
