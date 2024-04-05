package com.this1;

public class ThisEx {

	int i=1000;
	int j=100;
	static int k=90;
	void varFun(int i)
	{System.out.println(i+"\t"+k+"\t"+j);
	System.out.println(this.i+"\t"+k+"\t"+j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisEx obj=new ThisEx();
		obj.varFun(30);
	}

}
