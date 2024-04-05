package com.suchiit;

public class Account {
	private int ano;
	private String aname;
	private String aadd;
	public Account(int ano, String aname, String aadd) {
		super();
		this.ano = ano;
		this.aname = aname;
		this.aadd = aadd;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAadd() {
		return aadd;
	}
	public void setAadd(String aadd) {
		this.aadd = aadd;
	}
}
