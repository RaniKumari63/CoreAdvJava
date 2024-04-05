package StudentManagementSystem;

import java.util.Scanner;

public class StudentDetails {
	Scanner sc = new Scanner(System.in);
	StudentDaoImpl obj = new StudentDaoImpl();

	public void stuDetails() {
		while (true) {
			System.out.println("---------------------------------");
			System.out.println("             1)AddStudent        ");
			System.out.println("             2)ViewAllStudents   ");
			System.out.println("             3)ViewStudent     ");
			System.out.println("             4)DeleteStudent     ");
			System.out.println("             5)Back              ");
			System.out.println("---------------------------------");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				obj.addStudents();
				stuDetails();
				break;

			case 2:

				Student[] viewAllStudents = obj.viewAllStudents();
				
				if (viewAllStudents != null) {
					for (Student st : viewAllStudents) {
						if (st != null)

							System.out.println(st.getSno() + "\t" + st.getSname() + "\t" + st.getSadd());

					}
				} else {
					System.out.println("Record Doesn't Exist");
				}
				stuDetails();
				break;

			case 3:
				System.out.println("Enter Student Number");
				 
				Student st=obj.viewStudent(sc.nextInt());
				if(st!=null)
				{
					System.out.println(st.getSno()+"\t"+st.getSname()+"\t"+st.getSadd());
				}
				else {
					System.out.println("Given Record not Found");
				}
				stuDetails();	
				break;

			case 4:
				System.out.println("Enter Student Number");
				obj.deleteStudent(sc.nextInt());
				stuDetails();	
				
				break;
			case 5:
				StudentClient.main(null);

			default:
				
				System.out.println("Choose 1 to 5 between");

			}//end of switch
		} // end of while
	}
}
