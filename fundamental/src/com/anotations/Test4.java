package com.anotations;
@Deprecated
class Employee
{
	@Deprecated
	public void gen_Salary()
	{
		System.out.println("ddddddddddddd");
	}
	public void get_new_Salary()
	{
		System.out.println("ddddddddddddd");
	}
}
public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp=new Employee();
		emp.gen_Salary();
		emp.get_new_Salary();
	}

}
