package com.stream1assignment;

import java.time.LocalDate;
import java.util.List;

public class Order {
private long id;
private String status;
private LocalDate orderDate;
private LocalDate deliveryDate;
private List<Product> products;
private Customer customer;
public Order(long id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Product> products,
		Customer customer) {
	super();
	this.id = id;
	this.status = status;
	this.orderDate = orderDate;
	this.deliveryDate = deliveryDate;
	this.products = products;
	this.customer = customer;
}
public LocalDate getDeliveryDate() {
	return deliveryDate;
}
public void setDeliveryDate(LocalDate deliveryDate) {
	this.deliveryDate = deliveryDate;
}
public List<Product> getProducts() {
	return products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public LocalDate getOrderDate() {
	return orderDate;
}
public void setOrderDate(LocalDate orderDate) {
	this.orderDate = orderDate;
}
public Order(long id, String status, LocalDate orderDate) {
	super();
	this.id = id;
	this.status = status;
	this.orderDate = orderDate;
}
public Order() {
	super();
	// TODO Auto-generated constructor stub
}

}
