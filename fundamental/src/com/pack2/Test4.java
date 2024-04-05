package com.pack2;
import com.pack1.Test;
public class Test4 extends Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Test t=new Test();
//t.m6();
Test t2=new Test4();
//t2.m6();  protected memebers are accessed with only child reference outside the package
Test4 t4=new Test4();
t4.m6();
	}

}
