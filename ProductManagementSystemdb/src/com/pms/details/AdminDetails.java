package com.pms.details;

import java.util.List;
import java.util.Scanner;

import com.cms.dao.CustomerDAO;
import com.cms.dao.impl.CustomerDAOImpl;
import com.cms.model.Customer;
import com.pms.client.ProductClient;
import com.pms.dao.ProductDAO;
import com.pms.dao.impl.ProductDAOImpl;
import com.pms.exception.CustomerException;
import com.pms.model.Product;

public class AdminDetails {
	ProductDAO daoimpl = new ProductDAOImpl();
	CustomerDAO cdaoimpl = new CustomerDAOImpl();
	Scanner sc = new Scanner(System.in);

	public void menuDetails() {
		while (true) {
			System.out.format("%23s", "1)Product\n");
			System.out.format("%24s", "2)Customer\n");
			System.out.format("%20s", "3)Back\n");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				productMenu();
				break;
			case 2:
				try {
					custMenu();
				} catch (CustomerException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}

				break;
			case 3:
				ProductClient.main(null);
				break;
			default:
				System.out.println("Enter Choice between 1 to 3");

			}

		}
	}

	public void productMenu() {
		while (true) {
			System.out.format("%28s", "1)AddProducts\n");
			System.out.format("%32s", "2)ViewAllProducts\n");
			System.out.format("%28s", "3)ViewProduct\n");
			System.out.format("%30s", "4)UpdateProduct\n");
			System.out.format("%30s", "5)DeleteProduct\n");
			System.out.format("%21s", "6)Back\n");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			int i = 1;
			switch (choice) {
			case 1:
				while (i == 1) {
					System.out.println("Enter Product Id");
					int pid = sc.nextInt();
					System.out.println("Enter Product Name");
					String pname = sc.next();
					System.out.println("Enter Product Quantity");
					int pqty = sc.nextInt();
					System.out.println("Enter Product Price");
					int pprice = sc.nextInt();
					Product pro = new Product(pid, pname, pqty, pprice);
					int count = daoimpl.addProducts(pro);
					if (count != 0)

					{
						System.out.println("Data Inserted Successfully");
					} else {
						System.out.println("Data Not Inserted Successfully");
					}
					System.out.println("Do you want to add one more Product yes(1)/no(0)");
					i = sc.nextInt();
				}
				break;
			case 2:
				List<Product> viewAllProducts = daoimpl.viewAllProducts();
				viewAllProducts.stream().forEach(prod -> System.out.println(
						prod.getPid() + "\t" + prod.getPname() + "\t" + prod.getPqty() + "\t" + prod.getPprice()));
				break;
			case 3:
				System.out.println("Enter Product Id");
				Product product = daoimpl.viewProduct(sc.nextInt());
				if (product != null) {
					System.out.println(product.getPid() + "\t" + product.getPname() + "\t" + product.getPqty() + "\t"
							+ product.getPprice());

				} else {
					System.out.println("Given product id not Exists");
				}
				break;
			case 4:
				System.out.println("Enter Product Id");
				daoimpl.updateProduct(sc.nextInt());
				break;
			case 5:
				System.out.println("Enter Product Id");
				daoimpl.deleteProduct(sc.nextInt(choice));
				break;
			case 6:
				menuDetails();
				break;
			default:
				System.out.println("Choose between 1 to 6");

			}

		}
	}

	public void custMenu() throws CustomerException {
		while (true) {

			System.out.format("%28s", "1)AddCustomers\n");
			System.out.format("%32s", "2)ViewAllCustomers\n");
			System.out.format("%28s", "3)ViewCustomer\n");
			System.out.format("%30s", "4)UpDateCustomer\n");
			System.out.format("%30s", "5)DeleteCustomer\n");
			System.out.format("%20s", "6)Back\n");
			System.out.println("Enter the Choice");
			int choice = sc.nextInt();
			int i = 1;
			switch (choice) {
			case 1:
				while (i == 1) {
					System.out.println("Enter Customer Id");
					int cid = sc.nextInt();
					System.out.println("Enter Customer FirstName");
					String fname = sc.next();
					System.out.println("Enter Customer LastName");
					String lname = sc.next();
					System.out.println("Enter Customer Email");
					String email = sc.next();
					
					System.out.println("Enter Customer Password");
					String password = sc.next();
		
					if(password.length()<8)
					{
						throw new CustomerException("Length of password must be greater than 8");
					}
					
					System.out.println("Enter Customer MobileNumber");
					long mobilenumber = sc.nextLong();
					
					

					Customer cus = new Customer(cid, fname, lname, email, password, mobilenumber);
					int count = cdaoimpl.addCustomers(cus);
					if (count != 0)

					{
						System.out.println("Data Inserted Successfully");
					} else {
						System.out.println("Data Not Inserted Successfully");
					}
					System.out.println("Do you want to enter more Customers yes(1)/no(0)");
					i = sc.nextInt();
				}

				break;
			case 2:
				List<Customer> viewAllCustomers = cdaoimpl.viewAllCustomers();
				viewAllCustomers.stream()
						.forEach(customer -> System.out.println(customer.getCid() + "\t" + customer.getFname() + "\t"
								+ customer.getLname() + "\t" + customer.getEmail() + "\t" + customer.getPassword()
								+ "\t" + customer.getMobileNumber()));
				break;
			case 3:
				System.out.println("Enter customer Id");

				Customer custm = cdaoimpl.viewCustomer(sc.nextInt());
				if (custm != null)
					System.out.println(custm.getCid() + "\t" + custm.getFname() + "\t" + custm.getLname() + "\t"
							+ custm.getFname() + "\t" + custm.getEmail() + "\t" + custm.getPassword() + "\t"
							+ custm.getMobileNumber());
				break;
			case 4:
				System.out.println("Enter Customer Id");
                cdaoimpl.updateCustomer(sc.nextInt());
                
				break;
			case 5:
				System.out.println("Enter Customer Id");
				cdaoimpl.deleteCustomer(sc.nextInt());
				break;
			case 6:menuDetails();
				break;
			default:
				System.out.println("Enter Choice between 1 to 6");

			}

		}
	}
}
