package EmployeeManagementSystem;

import java.util.Scanner;

public class EmployeeClient {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		EmployeeDetails details=new EmployeeDetails();
		// TODO Auto-generated method stub
while(true)
{
	System.out.println("------------------------------------------------");
	System.out.println("                       1)Employee               ");
	System.out.println("                       2)Exit                   ");
	System.out.println("Enter the Choice");
	int choice = sc.nextInt();
	switch(choice){
	case 1:
		System.out.println("Enter User Name");
		String uname=sc.next();
		System.out.println("Enter Password");
		String pass=sc.next();
		if(uname.equals("admin")&&pass.equals("rani"))
			details.empDetails();
		else
			System.out.println("invalid username and password");
			
		break;
	case 2:
		System.out.println("Thx for App");
		System.exit(0);
		break;
	default:
		System.out.println("Choose 1 to 2 Between");
	}
}

}


	}
