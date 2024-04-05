package com.train.pojo;

public class Passenger {
private int pno;
private String pname;
private String paddr;
private int page;
private int uno;
public int getPno() {
	return pno;
}
public void setPno(int pno) {
	this.pno = pno;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPaddr() {
	return paddr;
}
public void setPaddr(String paddr) {
	this.paddr = paddr;
}
public int getPage() {
	return page;
}
public void setPage(int page) {
	this.page = page;
}
public int getUno() {
	return uno;
}
public void setUno(int uno) {
	this.uno = uno;
}
public Passenger(int pno, String pname, String paddr, int page, int uno) {
	super();
	this.pno = pno;
	this.pname = pname;
	this.paddr = paddr;
	this.page = page;
	this.uno = uno;
}
public Passenger() {
	super();
	// TODO Auto-generated constructor stub
}

}
