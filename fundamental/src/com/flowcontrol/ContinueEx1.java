package com.flowcontrol;

public class ContinueEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++)
		{ System.out.println("outer loop"+i);
			for(int j=0;j<10;j++)
			{ 
				if(j==5)
				{  
					continue;
				}
				
				System.out.println("inner loop"+j); 
			}
		}

	}

}
