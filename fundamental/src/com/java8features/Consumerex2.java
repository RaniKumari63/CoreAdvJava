package com.java8features;

import java.util.function.Consumer;

class movie
{
	String name;

	public movie(String name) {
		super();
		this.name = name;
	}
	
}
public class Consumerex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Consumer<movie> c1=n->System.out.println(n.name+"   Ready to release");
movie m=new movie("spider");
c1.accept(m);
	}

}
