package com.java8features;

import java.util.ArrayList;
import java.util.function.Predicate;

class User
{
	String name,role;

	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", role=" + role + "]";
	}
	
}
public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<User> al=new ArrayList<User>();
al.add(new User("aaaa","admin"));
al.add(new User("bbbb","member"));
Predicate<User> p1=u->u.getRole().equals("admin");
ArrayList<User> admins=process(al,p1);
System.out.println(admins);
	}
public static ArrayList<User> process(ArrayList<User> users,Predicate<User> p2)
{
	ArrayList<User> result=new ArrayList<User>();
	for(User user:users)
	{
		
		if(p2.test(user))
		result.add(user);
		
	}
	
	return result;
}

}
