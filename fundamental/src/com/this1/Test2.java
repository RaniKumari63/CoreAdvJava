package com.this1;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp=new Employee();
		emp.setEid("e-111");
		emp.setEname("aaa");
		emp.setEsal(50000.0f);
		emp.setEaddr("hyd");
		System.out.println("employee details");
		System.out.println("---------------");
		System.out.println("employee id"+emp.getEid());
		System.out.println("employee name"+emp.getEname());
		System.out.println("employee sal"+emp.getEsal());
			System.out.println("employee add"+emp.getEaddr());
		
	}

}
