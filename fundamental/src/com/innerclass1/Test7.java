package com.innerclass1;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Thread(new Runnable()
				{public void run()
				{
					for(int i=0;i<10;i++)
					{
					System.out.println("child thread");
					}
				}
			
				}).start();
		for(int i=0;i<10;i++)
		{System.out.println("main thread");
			
		}
	}

}
