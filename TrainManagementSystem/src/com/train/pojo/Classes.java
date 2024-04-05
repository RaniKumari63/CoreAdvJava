package com.train.pojo;

import java.util.List;

public class Classes {
private String classtype;
private List<Integer> seats;

public Classes(String classtype, List<Integer>seats) {
	super();
	this.classtype = classtype;
	this.seats = seats;
}



public List<Integer>getSeats() {
	return seats;
}

public void setSeats(List<Integer>seats) {
	this.seats = seats;
}

public Classes() {
	super();
	// TODO Auto-generated constructor stub
}

public Classes(String classtype) {
	super();
	this.classtype = classtype;
}

public String getClasstype() {
	return classtype;
}

public void setClasstype(String classtype) {
	this.classtype = classtype;
}
}
