package com.innerclass1;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t=new Thread() {
		public void run()
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("child thread");
			}
		}
		};
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main thread");
		}
	}

}
