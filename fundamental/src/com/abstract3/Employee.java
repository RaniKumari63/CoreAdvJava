package com.abstract3;

public abstract class Employee {
	private int eno;
	private String ename;
	private String dname;

	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
	abstract int CalculateSalary(String dname);

	public Employee(int eno, String ename, String dname) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.dname = dname;
	}
	}
