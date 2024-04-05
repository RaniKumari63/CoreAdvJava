
package com.ums.details;

import java.util.List;
import java.util.Scanner;

import com.pms.client.ProductClient;
import com.pms.pojo.Customer;
import com.pms.pojo.Product;
//import com.pms.DAOImpl.CustomerDaoImpl;
//import com.pms.DAOImpl.ProductDaoImpl;
import com.pms.DAOImpl.*;

public class AdminDetails {
	ProductDaoImpl pimpl = new ProductDaoImpl();
	CustomerDaoImpl cimpl = new CustomerDaoImpl();
	Scanner sc = new Scanner(System.in);

	public void menuDetails() {

		while (true) {
			System.out.println("----------------------------");
			System.out.println("------------1)Product-------");
			System.out.println("------------2)Customer------");
			System.out.println("------------3)Exit----------");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:

				productMenu();
				break;
			case 2:
				custMenu();

				break;
			case 3:
				ProductClient.main(null);
				break;
			default:
				System.out.println("Choose between 1 to 2");
			}

		}
	}

	public void productMenu() {
		while (true) {
			System.out.println("---------------------------------");
			System.out.println("-------------1)AddProduct---------");
			System.out.println("-------------2)ViewAllProducts----");
			System.out.println("-------------3)viewProduct--------");
			System.out.println("-------------4)updateProduct------");
			System.out.println("-------------5)deleteProduct------");
			System.out.println("-------------6)Back---------------");

			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				pimpl.addProduct();
				break;
			case 2:
				List<Product> p = pimpl.viewAllProduct();
				if (p != null) {
					System.out.println("Product List");
					for (Product p1 : p) {
						if (p1 != null) {
							System.out.println(
									p1.getPid() + "\t" + p1.getPname() + "\t" + p1.getPrice() + "\t" + p1.getQty());
						}

					}
				} else {
					System.out.println("Record Doesn't exist");

				}
				break;
			case 3:
				System.out.println("Enter Product id");

				Product pr = pimpl.viewProduct(sc.nextInt());
				if (pr != null) {
					System.out.println(pr.getPid() + "\t" + pr.getPname() + "\t" + pr.getQty() + "\t" + pr.getPrice());

				} else {
					System.out.println("Record Doesn't Exist");

				}

				break;
			case 4:
				System.out.println("Enter Product Id:");

				pimpl.updateProduct(sc.nextInt());
				break;

			case 5:
				System.out.println("Enter Product Id:");
				pimpl.deleteProduct(sc.nextInt());

				break;

			case 6:
				menuDetails();
				break;
			default:
				System.out.println("Enter choice between 1 to 6");

			}
		}
	}

	public void custMenu() {
		while (true) {
			System.out.println("------------------------------");
			System.out.println("-----------1)AddCustomer------");
			System.out.println("-----------2)viewCustomers-----");
			System.out.println("-----------3)viewCustomer------");
			System.out.println("-----------4)DeleteCustomer----");
			System.out.println("-----------5)Back--------------");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				cimpl.addCustomer();
				break;
			case 2:
				List<Customer> cus = cimpl.viewAllCustomer();
				if (cus != null) {
					for (Customer c : cus) {
						if (c != null) {
							System.out.println(c.getCid() + "\t" + c.getFname() + "\t" + c.getLname() + "\t"
									+ c.getEmail() + "\t" + c.getMobileNumber() + "\t" + c.getPassword());
						}

					}
				} else {
					System.out.println("Customer doesnot exist");
				}
				break;
			case 3:
				System.out.println("Enter Customer id");

				Customer cusom = cimpl.viewCustomer(sc.nextInt());
				if (cusom != null) {
					System.out.println(cusom.getCid() + "\t" + cusom.getFname() + "\t" + cusom.getEmail() + "\t"
							+ cusom.getPassword() + "\t" + cusom.getMobileNumber());

				} else {
					System.out.println("Record Doesn't Exist");

				}

				break;
			case 4:
				System.out.println("Enter Product Id:");
				cimpl.deleteCustomer(sc.nextInt());

				break;
			case 5:
				menuDetails();
				break;
			default:
				System.out.println("Choose between 1 to 5");
			}
		}
	}
}
