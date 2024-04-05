package com.pms.dao;

import java.util.ArrayList;
import java.util.List;

import com.pms.pojo.Customer;

public interface CustomerDAO {
void addCustomer();

List<Customer> customer=new ArrayList<Customer>();



List<Customer> viewAllCustomer();
Customer viewCustomer(int cid);
void deleteCustomer(int cid);
void buyProduct();
}
