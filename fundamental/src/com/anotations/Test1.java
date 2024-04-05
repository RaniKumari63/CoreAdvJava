package com.anotations;

class DB_Driver
{
	public void getDriver()
	{
		System.out.println("Type-1 driver");
	}
}
class New_DB_Driver extends DB_Driver
{   @Override
	public void getdriver()
	{
		System.out.println("Type-4 Driver");
	}
}
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DB_Driver driver=new New_DB_Driver();
		
		driver.getDriver();
	}

}
