package com.exception1;

public class Account1 {
private int acc_no;
private String name;
private double balance;
public int getAcc_no() {
	return acc_no;
}
public void setAcc_no(int acc_no) {
	this.acc_no = acc_no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Account1() {
	super();
	// TODO Auto-generated constructor stub
}
public Account1(int acc_no, String name, double balance) {
	super();
	this.acc_no = acc_no;
	this.name = name;
	this.balance = balance;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
}
