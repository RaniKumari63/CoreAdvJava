package com.stream1assignment;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product> product1=null;	
List<Product> product=new ArrayList<Product>();
product.add(new Product(1001,"aaa","books",233.8));
product.add(new Product(1002,"bbb","books",500.9));
product.add(new Product(1003,"ccc","books",1000.0));
product.add(new Product(1004,"ddd","baby",340.0));
product.add(new Product(1005,"eee","baby",5600.8));
product.add(new Product(1006,"fff","baby",222.8));
product.add(new Product(1007,"ggg","toys",2323.8));
product.add(new Product(1008,"hhh","toys",4394.8));
product.add(new Product(1001,"iii","toys",34234.8));

List<Order> order=new ArrayList<Order>();
product1=new ArrayList<Product>();


	//order.add(new Order(1001,"Delivered",new Date(01-02-2021).toLocalDate(),new Date(05-02-2021).toLocalDate(),product1,)));
	
	
	List<Product> productgreater=product.stream().filter(p->p.getPrice()>100).collect(Collectors.toList());
	productgreater.forEach(p1->System.out.println(p1.getId()+"\t"+p1.getName()+"\t"+p1.getPrice()));
	List<Order> orderbaby=order.stream().map(o->{
		for(Products p:o.getProducts())
		
	
	};)
	
	}

}
