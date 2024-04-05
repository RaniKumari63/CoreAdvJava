package com.singleton;

public class Test {

	
	private static Test t=null;
	 Test()
	{
		
	}
	public static Test getTest()
	{
		if(t==null)
		{t=new Test();
			
		}
		return t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Test.getTest().hashCode());
System.out.println(Test.getTest().hashCode());
System.out.println(Test.getTest().hashCode());
System.out.println(Test.getTest().hashCode());
	}

}
