package com.train.DAOImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.train.DAO.AdminDao;
import com.train.pojo.Classes;

import com.train.pojo.Stations;
import com.train.pojo.Train;

public class AdminDaoImpl implements AdminDao {
	Scanner sc = new Scanner(System.in);

	@Override
	public void addTrainInfo() {
		// TODO Auto-generated method stub

		int k = 1;
		while (k == 1) {
			System.out.println("Enter TrainNo");
			int tno = sc.nextInt();
			System.out.println("Enter TrainName");
			String tname = sc.next();
			System.out.println("Enter Date(dd/mm/yy)");
			String d = sc.next();
			System.out.println("Enter Station number from the list");
			
			
			
			for (Map.Entry<Integer, Stations> entry : stations.entrySet()) { 
				int key = entry.getKey();
				Stations s = entry.getValue();

				System.out.println(key + "\t" + s.getStname());
			}
			
			int j = 1, i = 1;
			Map<Integer, Stations> stations1 = new HashMap<Integer, Stations>();
			
			while (j == 1) {
				System.out.println("Enter StationName");
				String sname = sc.next();
				Stations st = new Stations(sname);

				stations1.put(i, st);
				i++;
				System.out.println("Do you want to add one more Station Yes(1)/No(0)");
				j = sc.nextInt();
			}
			
			
			
			
			Train t = new Train(tno, tname, stations1, d,classes1);
			train.add(t);
			System.out.println("Do you want to add one more Train Yes(1)/No(0)");
			k = sc.nextInt();
		}

	}

	@Override
	public List<Train> viewAllTrainInfo() {
		// TODO Auto-generated method stub
		return train;
	}

	@Override
	public Train viewTrainInfo(int trainno) {
		if (train.size() != 0) {
			int k = 0;
			for (Train t : train) {

				if (t.getTno() == trainno) {
					++k;
					return t;
				}
			}

			if (k == 0)

				System.out.println("Train Doesn't Exists");
			return null;

		} else

		{
			System.out.println("Train Doesn't Exists");
			return null;
		}

	}

	@Override
	public void updateTrainInfo(int trainno) {
		// TODO Auto-generated method stub
		
		for (Train t : train) { if(train.size()!=0)
		{
			if (t.getTno()==trainno)

			{
				System.out.println("What do you want to update 1)tname 2)date 3) stations");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter Train Name");
					String name = sc.next();
					t.getTname();
					System.out.println("Train Updated successfully");
					break;
				case 2:
					System.out.println("Enter Date(dd/mm/yy)");
			        String dt= sc.next();
					t.setD(dt);
					System.out.println("Train Updated successfully");
					break;
				case 3:
					int k=1;
					while(k==1)
					{
						
						System.out.println("Enter Station no");
						int sno=sc.nextInt();
						System.out.println("Enter Station name");
						String sname=sc.next();
						for(Map.Entry<Integer, Stations>entry :t.getStations().entrySet())
						{
						if(entry.getKey()==sno)
						{ Stations st=new Stations(sname);
						System.out.println(entry.getValue());
							entry.setValue(st);
						}
						}
					System.out.println("Do you want to update one more station Yes(1)/No(0)");
					k=sc.nextInt();
					
					}
				
					

					System.out.println("Train Station Updated successfully");
					break;
				default:
					System.out.println("Choose between 1 to 3");

				}
			}
			else
			{System.out.println("Train list doesn't exist");
				
			}
		}else
		{
			System.out.println("Train list doesn't exist");	
		}
		}
		
	}

	@Override
	public boolean verifyUserAndPw(String username, String pw) {
		// TODO Auto-generated method stub
		if (username.equals("admin") && (pw.equals("pw"))) {
			return true;

		} else {
			return false;
		}

	}

	@Override
	public void deleteTrainInfo(int trainno) {
		// TODO Auto-generated method stub
		if (train.size() != 0) {
			int k = 0;
			int j = 0;
			for (Train t : train) {

				if (t.getTno() == trainno) {
					++k;
					train.remove(j);
					break;
				}
				j++;
			}

			if (k == 0)

				System.out.println("Train Doesn't Exists");

		} else

		{
			System.out.println("Train Doesn't Exists");

		}

	}

	@Override
	public void viewBookedTicket() {
		// TODO Auto-generated method stub

	}

	@Override
	public void viewHelpReport() {
		// TODO Auto-generated method stub

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pdf() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addStations() {

		int k = 1, i = 1;
		while (k == 1) {

			System.out.println("Enter StationName");
			String sname = sc.next();
			Stations st = new Stations(sname);
			stations.put(i, st);
System.out.println(stations.get(i));
			System.out.println("Do you want to add one more station Yes(1)/No(0)");
			k = sc.nextInt();
			i++;
		}

		// TODO Auto-generated method stub

	}
	
	public void addClasses()
	{classes1.clear();
	
		int k = 1, i = 1;
	while (k == 1) {

		System.out.println("Enter Class Type");
		String cname = sc.next();
		     System.out.println("Enter No.of Seats");
         int size1=sc.nextInt();
         List<Integer> seats1=new ArrayList<Integer>();
         for(int i1=0;i1<size1;i1++)
         {
        	 seats1.add(0);
         }
        Classes c=new Classes(cname,seats1);
		classes1.add(c);
		

		System.out.println("Do you want to add one more classes Yes(1)/No(0)");
		k = sc.nextInt();
		i++;
	}
		
	}

	
	
}
