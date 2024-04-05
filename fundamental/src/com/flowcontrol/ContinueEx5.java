package com.flowcontrol;

public class ContinueEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cut: for(int i=0;i<10;i++)
		{ 
			for(int j=0;j<10;j++)
			{ if(j==5)
			   {  continue cut;
				
			   }
			System.out.println(i+"--"+j);
				
			}
		}

	}

}
