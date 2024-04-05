package com.java8features;

import java.util.function.Consumer;

class Movie7
{String mname;

public Movie7(String mname) {
	super();
	this.mname = mname;
}

public String getMname() {
	return mname;
}

public void setMname(String mname) {
	this.mname = mname;
}
	
}
public class Test555 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Consumer<Movie7> c=m->System.out.println(m.mname+"ready to release");
Consumer<Movie7> c1=m->System.out.println(m.mname+"aaaaaaaaaa");
Consumer<Movie7> c2=m->System.out.println(m.mname+"bbbbbb");
Consumer<Movie7> cc=c.andThen(c1).andThen(c2);
Movie7 m1=new Movie7("spider");
cc.accept(m1);

	}

}
