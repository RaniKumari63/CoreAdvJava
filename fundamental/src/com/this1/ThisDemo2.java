package com.this1;
class Test98
{
	Test98(ThisDemo2 td)
	{
		System.out.println(td);
		
	}
	Test98()
	{
	
}
public class ThisDemo2 {
  void m1()
  {
	Test98 t8=new Test98(this);
	
  }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisDemo2 td=new ThisDemo2();
		td.m1();
		
				
		
	}
}}
