package com.train.details;

import java.util.List;
import java.util.Scanner;

import com.train.DAOImpl.AdminDaoImpl;
import com.train.DAOImpl.UserDaoImpl;
import com.train.pojo.Classes;
import com.train.pojo.Passenger;
import com.train.pojo.Train;

public class BookingDetails {
	
	Scanner sc = new Scanner(System.in);
	UserDaoImpl uimpl = new UserDaoImpl();
	int value=0;
	public void menuDetails(int uid, String uname) {
		while (true) {
			System.out.println("----------------------------------------------------");
			System.out.println("-----------1)AddPassenger---------------------------");
			System.out.println("-----------2)ViewAllPassenger-----------------------");
			System.out.println("-----------3)SelectPassenger-------------------------");
			System.out.println("-----------4)BookTicket------------------------------");
			System.out.println("-----------5)PayAmount-------------------------------");
			System.out.println("-----------6)PrintTicket-----------------------------");
			System.out.println("-----------7)Back-----------------------------------");
			System.out.println("-----------------------------------------------------");

			System.out.println("Enter the choice");

			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				uimpl.addPassenger(uid);

				break;
			case 2:
				List<Passenger> p = uimpl.viewAllPassengers(uid, uname);
				if (p.size() != 0) {
					System.out.println("Passenger list");
					for (Passenger ps : p) {
						if (ps != null) {
							System.out.println(ps.getPno() + "\t" + ps.getPname() + "\t" + ps.getPage() + "\t" + uname+ "\t" + ps.getPaddr());

						} else {
							System.out.println("Passengers doesn't exist");
						}
					}

				} else {
					System.out.println("Passengers doesn't exist");
				}
				break;
				
			case 3:
				List<Passenger> p1 = uimpl.viewAllPassengers(uid, uname);
				
				if (p1.size() != 0) {
					
					System.out.println("Select Passenger ");
					for (Passenger ps : p1) {
						if (ps != null) {
							System.out.println(ps.getPno() + "\t" + ps.getPname() + "\t" + ps.getPage() + "\t" + uname
									+ "\t" + ps.getPaddr());
							System.out.println("Do you want to select this passenger yes(1)/no(0)");
							int choice1 = sc.nextInt();
							if (choice1 == 1) {
								uimpl.selectpassenger1.add(ps);

							} else {
                                      continue;
							}
						} else {
							System.out.println("Passengers doesn't exist");
						}
					}

				} else {
					System.out.println("Passengers doesn't exist");
				}
				List<Passenger> selpass1 = uimpl.selectpassenger1;
				for (Passenger p5 : selpass1) {
					System.out.println(p5.getPno() + "\t" + p5.getPname() + "\t" + p5.getPage() + "\t" + uname
							+ "\t" + p5.getPaddr());
				}
				break;
			case 4:
				List<Passenger> selpass = uimpl.selectpassenger1;
				AdminDaoImpl adao = new AdminDaoImpl();
				  System.out.println("Enter Start Station ");
				  String sst=sc.next();
				  System.out.println("Enter Destination Station");
				  String dst=sc.next();
				  System.out.println("Enter Date(dd/mm/yy)");
				  String date1=sc.next();
				  System.out.println("Enter class Type");
				  String classes3=sc.next();
				  System.out.println("Enter Train no");
				  int tno=sc.nextInt();
				  
				 boolean value2= uimpl.trainAvaliability(sst, dst, date1, classes3);
				 System.out.println("ddddddd"+value2);
				  if(value2==true)
				  {
					  
					  
			 value=uimpl.seatAvaliability(tno,sst, dst, date1,classes3);
			
			
			if(selpass.size()==value)
			{
				for (Train t :adao.train) {
					 if(t.getTno()==tno)
					 { 
						 for(Classes c:t.getClasses())
			    		   {
			    			 if((c.getClasstype().equals(classes3)))
			    					 {
			    				  for(int i=0;i<value;i++)
			    					  
			    				  {
			    					c.getSeats().add(1);
			    					
			    						
			    				  }
			    				  System.out.println(value+" tickets are Booked ");
			    					 }
			    		   }
					 
						 break;
					 }
					
				}
				
			}
				  }
				
				break;
			case 5:
				
				
				break;
			case 6:
				break;
			case 9:
			default:UserDetails ud=new UserDetails();
			
				System.out.println("Thanks for Using This APP");

			}

		}
	}

}