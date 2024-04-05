package com.pms.DAOImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pms.dao.CustomerDAO;
import com.pms.dao.ProductDAO;
import com.pms.pojo.Customer;
import com.pms.pojo.Product;
import com.pms.DAOImpl.*;

public class CustomerDaoImpl implements CustomerDAO{
Scanner sc=new Scanner(System.in);

int index=0;
	@Override
	public void addCustomer() {
		System.out.println("Enter no.of customers");
		index=sc.nextInt();
		for(int i=0;i<index;i++)
		{
		System.out.println("Enter Customer Id ");
		int cid=sc.nextInt();
		System.out.println("Enter Customer First Name");
		String fname=sc.next();
		System.out.println("Enter Customer Last Name");
		String lname=sc.next();
		System.out.println("Enter Customer Email");
		String email=sc.next();
		System.out.println("Enter Customer password");
		String pass=sc.next();
		System.out.println("Enter Mobile No");
		long mobileno=sc.nextLong();
		Customer cus=new Customer(cid, fname, lname, email,pass,mobileno);
		
		customer.add(i,cus);
		System.out.println("Customer Recoreds are added Succesfully");
		}
	}

	@Override
	public List<Customer> viewAllCustomer() {
		// TODO Auto-generated method stub
		return customer;
	}

	@Override
	public Customer viewCustomer(int cid) {
		// TODO Auto-generated method stub
		int j=0;
		for(Customer c:customer)
		{if(c.getCid()==cid) {
			++j;
		     return  c;
		}
		}
		if(j==0)
			System.out.println("Customer doesnot exists");
		return null;
	}

	@Override
	public void deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		int j=0;
		int k=0;
		for(Customer c:customer)
		{if(c.getCid()==cid) {
			++j;
			 customer.remove(k);
			 break;
			
		    
		}
		++k;
		}
		if(j==0)
			System.out.println("Customer doesnot exists");
		
	}

	@Override
	public void buyProduct() {
		// TODO Auto-generated method stub
		int totalprice=0;
		
		
		System.out.println("How many Products");
		int prd=sc.nextInt();
		
		
		for(int i=0;i<prd;i++) {
		System.out.println("Enter Product Id:");
	    int  pid=sc.nextInt();

	  for(Product p:ProductDaoImpl.product)
	  {
		  if(p.getPid()==pid)
			  totalprice+=p.getQty()*p.getPrice();
	  }
		}
		System.out.println("totalprice:"+totalprice);
	}
	

}
