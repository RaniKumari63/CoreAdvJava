package com.cms.dao;

import java.util.List;

import com.cms.model.Customer;
import com.pms.model.Product;

public interface CustomerDAO {

	public int addCustomers(Customer cus);
	public List<Customer>viewAllCustomers();
	public Customer viewCustomer(int cid);
	public void updateCustomer(int cid);
	public void deleteCustomer(int cid);
	public void buyProduct();
}
