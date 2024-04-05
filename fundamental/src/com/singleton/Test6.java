package com.singleton;

public class Test6 {
 
	private static Test6 t1=null;
	private static Test6 t2=null;
	private Test6()
	{
		
	}
	public static Test6 getTest()
	{
		if(t1==null)
		{t1=new Test6();
		return t1;
			
		}
		else if(t2==null)
		{
			t2=new Test6();
			return t2;
		}
		else
		{
			if(Math.random()<10.5)
			
				return t1;
				else
					return t2;
				
				
				
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
