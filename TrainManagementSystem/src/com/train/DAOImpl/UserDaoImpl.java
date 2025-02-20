package com.train.DAOImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.train.DAO.AdminDao;
import com.train.DAO.UserDao;
import com.train.pojo.Classes;
import com.train.pojo.Passenger;
import com.train.pojo.Stations;
import com.train.pojo.Train;
import com.train.pojo.User;

public class UserDaoImpl implements UserDao {
	Scanner sc = new Scanner(System.in);
	AdminDaoImpl adao = new AdminDaoImpl();

	@Override
	public void addUser() {
		// TODO Auto-generated method stub

		System.out.println("Enter UserName");
		String uname = sc.next();
		System.out.println("Enter User Id");
		int uid = sc.nextInt();
		System.out.println("Enter User add");
		String uadd = sc.next();
		System.out.println("Enter User email");
		String uemail = sc.next();

		System.out.println("Enter User password");
		String upwd = sc.next();
		User u = new User(uname, uid, uadd, uemail, upwd);

		user.add(u);
		System.out.println("Users Successfully Registered");

	}

	@Override
	public void verifyUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPassenger(int uid) {

		int k = 1;
		while (k == 1) {
			System.out.println("Enter Passenger No");
			int pno = sc.nextInt();
			System.out.println("Enter Passenger Name");
			String pname = sc.next();
			System.out.println("Enter Passenger Address");
			String paddr = sc.next();
			System.out.println("Enter Passenger Age");
			int page = sc.nextInt();
			int uno = uid;
			// TODO Auto-generated method stub
			Passenger p = new Passenger(pno, pname, paddr, page, uno);
			passenger.add(p);
			System.out.println("Do you want to enter more passenger Yes(1)/No(0)");
			k = sc.nextInt();
		}
		System.out.println("Passengers added successfully");

	}

	@Override
	public List<Passenger> viewAllPassengers(int uno, String uname) {
		// TODO Auto-generated method stub
		return passenger;
	}

	@Override
	public void bookTickets() {
		// TODO Auto-generated method stub

	}

	@Override
	public void payAmount() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean trainAvaliability(String sst, String dst, String date1, String classes) {
		// TODO Auto-generated method stub
			boolean value1 = false;
		List<Integer> key = new ArrayList<Integer>();

		List<Train> trainlist = adao.train;
		if (trainlist.size() != 0) {
			for (Train t : trainlist) {
				if (t != null) {
					int k = 0;
					
					for (Map.Entry<Integer, Stations> entry : t.getStations().entrySet()) {
						System.out.println(entry.getValue().getStname()+"\t"+(t.getD() == date1)+"\t"+sst);
						
						if (sst.equals(entry.getValue().getStname())&&(t.getD().equals(date1)))

						{
							++k;
							key.add(entry.getKey());
						}

						if (dst.equals(entry.getValue().getStname())) {
							
							++k;
							key.add(entry.getKey());

						}
						
						
						if (k == 2) {
							
							value1 = true;

						}

					}

				} else {
					System.out.println("Trains doesnt exist");
				}

			}
		} else {
			System.out.println("Trains doesnt exist");
		}

		return value1;
	}

	public int seatAvaliability(int trainno,String sst, String dst, String date1,String classtype) {
		// TODO Auto-generated method stub
		int j=0;
		
		List<Integer> key=new ArrayList<Integer>();
		
		List<Train> trainlist=adao.train;
	if(trainlist.size()!=0)
	{
	for(Train t:trainlist)
	{ 
		if(t.getTno()==trainno)
		{
			int k=0;
			System.out.println("Station List");
    		for(Map.Entry<Integer, Stations> entry:t.getStations().entrySet())
    		{  
    			if(sst.equals(entry.getValue())&&(t.getD()==date1))
    			
    				{
    			     ++k;
    				key.add(entry.getKey());
    				}
    				
    		
    			
    		   if(dst.equals(entry.getValue()))
     			   {
    			   ++k;
    			   key.add(entry.getKey());
     			   
     			   }
    		  
    		   
    		   for(Classes c:t.getClasses())
    		   {
    			 if((c.getClasstype().equals(classtype)))
    					 {
    				  for(int i=0;i<c.getSeats().size();i++)
    					  
    				  {
    					if(c.getSeats().get(i)==0)
    						++k;
    					++j;
    				  }
    					 }
    		   }
    		   if(k>=3)
    		   {
    			  
    			   return j;
    			  
    		   }
    		  
    		
    		}
    	
    		
			
			
			
		}
		else
		{
			System.out.println("Trains doesnt exist");
		}
		
	}
	}
	else
	{
		System.out.println("Trains doesnt exist");
	}
		
		
		return j;
	}

	
}


