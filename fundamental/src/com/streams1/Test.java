package com.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Customer
{
	private int id;
	private String name;
	private String email;
	private List<String> phonenumbers;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name, String email, List<String> phonenumbers) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phonenumbers = phonenumbers;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getPhonenumbers() {
		return phonenumbers;
	}
	public void setPhonenumbers(List<String> phonenumbers) {
		this.phonenumbers = phonenumbers;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Customer c=new Customer(101, "abc","hghgh",Arrays.asList("56657578","879790709"));
	c.getName();
	System.out.println(c.getName());
	//Customer c1=new Customer(101,null);
	
	//String name=c1.getName();
	//System.out.println(name);
	//name.toUpperCase()
	Optional<Object> emptyoptional =Optional.empty();
	System.out.println(emptyoptional);
	//Optional<String> emailoptional=Optional.of(c1.getEmail());
	//System.out.println(emailoptional);
	Optional<Object> emptyoptional2 =Optional.ofNullable(c.getEmail());
	
	if(emptyoptional2.isPresent())
	{
		System.out.println(emptyoptional2.get());
	}
	
	System.out.println(emptyoptional2.orElse("jkkl89990"));
	//System.out.println(emptyoptional2.orElseThrow(()->new IllegalArgumentException("jjjkjkhguihi")));	
	System.out.println(emptyoptional2.map(String::toLowerCase).orElseGet(()->"default email.."));
	}

}
