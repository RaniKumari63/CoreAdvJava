package com.enum1;

public class Test4 {
	static Test4 i=new Test4();
	static Test4 i1=new Test4(10);
	Test4()
	{
		System.out.println("o argument constructor");
		}
	Test4(int i)
	{System.out.println("1 argument constructor");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.print(i1(10));

}

}