package EmployeeManagementSystem;

import java.util.Scanner;

public class EmployeeDetails {
	Scanner sc=new Scanner(System.in);
	EmployeeDaoImpl obj=new EmployeeDaoImpl();
	Employee[] emp=null;
	Employee empobj=null;
	public void empDetails()
	{
		while(true)
		{
			 System.out.println("------------------------------------");
			 System.out.println("               1)AddEmployees       ");
			 System.out.println("               2)ViewAllEmployees   ");
			 System.out.println("               3)ViewEmployee        ");
			 System.out.println("               4)DeleteEmployees     ");
			 System.out.println("               5)Back                ");
             System.out.println("------------------------------------ ");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				obj.addEmployee();
				  empDetails();
				 break;
			case 2:
				  emp=obj.viewAllEmployees();
				  if(emp!=null)
				  {for(Employee e:emp)
				  {   
					  if(e!=null)
				  {
					  System.out.println(e.getEid()+"\t"+e.getEname()+"\t"+e.getEaddr()+"\t"+e.getEsal());
				  }
					  
					
				  }
					  
				  }
				  else
				  {
					  System.out.println("Record not found");
				  }
				  empDetails();
				 break;
			case 3:
				System.out.println("Enter Employee Id");
				
				 empobj=obj.viewEmployee(sc.nextInt());
				 if(empobj!=null)
					 System.out.println(empobj.getEid()+"\t"+empobj.getEname()+"\t"+empobj.getEaddr()+"\t"+empobj.getEsal());
				 else 
					 System.out.println("Record doesn't exist");
			      empDetails();
				  break;
			case 4:
				System.out.println("Enter Employee Id");
				obj.deleteEmployee(sc.nextInt());
				System.out.println("Record Deleted Successfully");
				empDetails();
				  break;
			case 5:
				EmployeeClient.main(null);
				break;
				default:
					System.out.println("Choose 1 to 5 between");
			}
				
		}//end of while
	}

}
