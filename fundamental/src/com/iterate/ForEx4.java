package com.iterate;



public class ForEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k3 = 0;
		int k4=1;
		for(int i5 = 0; i5<10;++i5) // rows
		{
			
			for (int j5 = 0; j5< 5; ++j5) // columns
			{
				
				if(k3==0)
				{ 
				System.out.print(k4+" ");
				
				}
				
				k3 = k3 + 5;
				System.out.print(k3+" ");
			
			}
			System.out.println();

		}


	}

}
