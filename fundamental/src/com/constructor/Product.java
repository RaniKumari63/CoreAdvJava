package com.constructor;

public class Product {

	int pid;
	String pname;
	String qty;
	public Product()
	{
		System.out.println("default constructor");
	}
	public Product(int pid,String pname,String qty)
	{
		this.pid=pid;
		this.pname=pname;
		this.qty=qty;
		
	}
	
	void displayDetails()
	{
		System.out.println(pid+"\t"+pname+"\t"+qty);
	}
	Product(Product pro2)
	{
		pid=pro2.pid;
		pname=pro2.pname;
		qty=pro2.qty;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Product pro=new Product(10,"tv","100");
Product pro1=new Product();
pro1.pid=pro.pid;
pro1.pname=pro.pname;
pro1.qty=pro.qty;
pro.displayDetails();
pro1.displayDetails();
	}

}
