package com.cms.model;

public class Customer {
private int cid;

private String fname;
private String lname;
private String email;
private String password;
private long mobileNumber;
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(int cid, String fname, String lname, String email, String password, long mobileNumber) {
	super();
	this.cid = cid;
	this.fname = fname;
	this.lname = lname;
	this.email = email;
	this.password = password;
	this.mobileNumber = mobileNumber;
}
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
}
