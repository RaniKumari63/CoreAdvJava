package com.inheritance1;

public class Manager extends Employee {
	
Manager(String eid,String ename,String eaddr)
{this.eid=eid;
this.ename=ename;
this.eaddr=eaddr;
	
}

public void getManagerDetails() {
System.out.println("manager Details");
System.out.println("-----------------");
getEmpDetails();

}
}

