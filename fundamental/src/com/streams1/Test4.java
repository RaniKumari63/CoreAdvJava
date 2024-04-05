package com.streams1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product8
{
	int pid;
	String pname;
	int qty;
	int price;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public Product8() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product8(int pid, String pname, int qty, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.qty = qty;
		this.price = price;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		
		this.price = price;
	}
}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product8> productList=new ArrayList<Product8>();
		productList.add(new Product8(1,"hplaptop",10,25000));
		productList.add(new Product8(2,"lenvolaptop",25,35000));
		productList.add(new Product8(3,"delllaptop",6,45000));
		productList.add(new Product8(4,"sonylaptop",45,55000));
		productList.add(new Product8(5,"applelaptop",26,26000));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price");
		int priceTag=sc.nextInt();
		List<Product8> products=productList.stream().filter(p->p.getPrice()>priceTag).collect(Collectors.toList());
		products.forEach(p->System.out.println(p.getPid()+"\t"+p.getPname()+"\t"+p.getPrice()+"\t"+p.getQty()));
		products.forEach(System.out::println);
		List<Integer> products1=productList.stream().filter(p->p.getPrice()>priceTag)
		.map(p->p.getPrice())
		.collect(Collectors.toList());
		products1.forEach(System.out::println);
		
		Object[] array=products1.toArray();
		for(Object obj:array)
		{
			Integer pro=(Integer)obj;
			System.out.println(pro);
		}
		
		Object[] array1=products1.toArray();
		for(Object obj:array)
		{
			Integer pro=(Integer)obj;
			System.out.println(pro);
		}
		List<Object>prices=Arrays.asList(array1);
		prices.stream().forEachOrdered(System.out::println);
		Stream.of(array1).forEachOrdered(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
