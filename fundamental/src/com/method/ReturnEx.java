package com.method;

public class ReturnEx {

	
	int add(int fno,int sno)
	{
		int result=fno+sno;
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReturnEx d=new ReturnEx();
		int result=d.add(100, 200);
		
	}

}