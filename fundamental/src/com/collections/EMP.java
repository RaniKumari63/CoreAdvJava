package com.collections;

public class EMP  implements Comparable{
public EMP() {
		super();
		// TODO Auto-generated constructor stub
	}

public EMP(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
}

public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

private int eid;
String ename;

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		EMP e=(EMP)o;
		if(eid==e.eid)
		return 0;
		else if(eid>e.eid)
			return 1;
		else
			return -1;
	}

}
