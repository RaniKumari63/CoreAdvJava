package com.pms.DAOImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pms.dao.ProductDAO;
import com.pms.pojo.Customer;
import com.pms.pojo.Product;

public class ProductDaoImpl implements ProductDAO {

	Scanner sc = new Scanner(System.in);
	CustomerDaoImpl cimpl=new CustomerDaoImpl();
	
	public void addProduct() {
		System.out.println("Enter no. of products");
		int index = sc.nextInt();
		for (int i = 0; i < index; i++) {

			System.out.println("Enter Product Id");
			int pid = sc.nextInt();
			System.out.println("Enter Product Name");
			String pname = sc.next();
			System.out.println("Enter Product Quantity");
			int pqty = sc.nextInt();
			System.out.println("Enter Product Price");
			int pprice = sc.nextInt();
			Product p = new Product(pid, pname, pqty, pprice);
			product.add(i, p);
		
			System.out.println("Product Record Added Successfully");
		}

	}

	public List<Product> viewAllProduct() {

		return product;

	}

	public Product viewProduct(int pid) {
		int k = 0;
		for (Product p : product) {
			if (p.getPid() == pid) {
				++k;
				return p;
			}
		}

		if (k == 0)

			System.out.println("Given Record Not Exist");
		return null;

	}

	public void updateProduct(int pid) {
		for (Product pro : product) {
			if (pro.getPid() == pid)

			{
				System.out.println("What do you want to update 1)pname 2)pqty 3) price");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Product Nmame");
					String name = sc.next();
					pro.setPname(name);
					System.out.println("Product Updated successfully");
					break;
				case 2:
					System.out.println("Enter Product Qty");
					int pqty = sc.nextInt();
					pro.setQty(pqty);
					System.out.println("Product Qty Updated successfully");
					break;
				case 3:
					System.out.println("Enter Product Price");
					int price = sc.nextInt();
					pro.setPrice(price);
					System.out.println("Product Price Updated successfully");
					break;
				default:
					System.out.println("Choose between 1 to 3");

				}
			}

		}

	}

	public void deleteProduct(int pid) {
		
	
	
		int j=0;
		int k=0;
		for(Product p:product)
		{  
			
			if(p.getPid()==pid)
			{
			
			++k;
		  product.remove(j).getPid();
	     	break;
			}
			j++;
		}
		 if (k== 0)
			  System.out.println("Given Record Not Exist");
			 
	 

	}

	public boolean verifyUnAndPw(String email, String pass) {
		boolean value=true;
		for(Customer c:cimpl.customer)
		{
			  if((email.equals(c.getEmail()))&&(pass.equals(c.getPassword())))
			  {
				  value=true;
				 break;
			  }
			  else
			  {  value=false;
				 
			  }
			
		}
		return value;
	}
}
