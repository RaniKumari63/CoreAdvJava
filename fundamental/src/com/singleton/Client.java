package com.singleton;
class Test
{
	private static Test t=null;
	private Test()
	{
		
	}
	public static Test getTest()
	{
		if(t==null)
		{
			t=new Test();
					
		}
		return t;
	}
}
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Test.getTest().hashCode());
	}

}
