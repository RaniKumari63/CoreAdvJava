package com.anotations;

import java.util.ArrayList;

class Bank
{ 
	
	@SuppressWarnings("unchecked")
	public ArrayList get_CustomerDetails()
	{ArrayList al=new ArrayList();
	al.add("aaa");
	al.add("bbb");
	al.add("ccc");
	al.add("ddd");
	return al;	
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank b=new Bank();
ArrayList list=b.get_CustomerDetails();
System.out.println(list);
	}

}
