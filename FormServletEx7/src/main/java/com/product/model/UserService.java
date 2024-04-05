package com.product.model;

public class UserService {
String uname ;
public UserService() {
	super();
	// TODO Auto-generated constructor stub
}
public UserService(String uname, String upwd, String email, long umobile) {
	super();
	this.uname = uname;
	this.upwd = upwd;
	this.email = email;
	this.umobile = umobile;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getUpwd() {
	return upwd;
}
public void setUpwd(String upwd) {
	this.upwd = upwd;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getUmobile() {
	return umobile;
}
public void setUmobile(long umobile) {
	this.umobile = umobile;
}
String upwd;
String email;
long umobile;
}
