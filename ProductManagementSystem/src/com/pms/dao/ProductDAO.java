package com.pms.dao;

import java.util.ArrayList;
import java.util.List;

import com.pms.pojo.Product;

public interface ProductDAO {

List<Product> product=new ArrayList<Product>();


void addProduct();

List<Product> viewAllProduct();
Product viewProduct(int pid);
void updateProduct(int pid);
void deleteProduct(int pid);

}
