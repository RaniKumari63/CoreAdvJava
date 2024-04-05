package com.train.details;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.train.DAOImpl.*;
import com.train.client.OnlineClient;
import com.train.pojo.Classes;
import com.train.pojo.Stations;
import com.train.pojo.Train;
public class AdminDetails {
    Scanner sc=new Scanner(System.in);
    AdminDaoImpl aimpl=new AdminDaoImpl();
    public void menuDetails()
    {
        while(true)
        {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("---------------------1)Add Stations------------------------------");
            System.out.println("---------------------2)Add Class Type------------------------------");
            System.out.println("---------------------3)Add Train Information---------------------");
            System.out.println("---------------------4)View All TrainInformation-----------------");
            System.out.println("---------------------5)Update Train Information------------------");
            System.out.println("---------------------6)Delete Train Informatio-------------------");
            System.out.println("---------------------7)View Booked Tickets-----------------------");
            System.out.println("---------------------8)Help Report-------------------------------");
            System.out.println("---------------------9)View Passenger List-----------------------");
            System.out.println("---------------------10)Back--------------------------------------");

            System.out.println("Enter the Choice :");
            int choice=sc.nextInt();
            switch(choice)
            {
            case 1: aimpl.addStations();
                break;
            case 2:aimpl.addClasses();
            	break;
            case 3:aimpl.addTrainInfo();
                break;
            case 4:List<Train> l=aimpl.viewAllTrainInfo();
            if(l.size()!=0)
            {System.out.println("Train List");
            	for(Train t:l)
            	{ if(t!=null)
            	{
            		System.out.println(t.getTno()+"\t"+t.getTname()+"\t"+t.getD());
            		System.out.println("Station List");
            		for(Map.Entry<Integer, Stations> entry:t.getStations().entrySet())
            		{
            			System.out.println(entry.getKey()+"\t"+entry.getValue().getStname());
            		}
            		System.out.println("Class Type");
            		for(Classes c:t.getClasses())
            		{System.out.print(c.getClasstype()+"\t");
            			System.out.println(c.getSeats().size());
            			
            		}
            		
            	}else
            	{System.out.println("Train List Doesn't Exist");
            		
            	}
            		
            	}
            }else
            {
            	System.out.println("Train List Doesn't Exist");
            }
                break;
            case 5: System.out.println("Enter Train no");
            aimpl.updateTrainInfo(sc.nextInt());
                break;
            case 6:
            	 System.out.println("Enter Train no");
                 aimpl.deleteTrainInfo(sc.nextInt());
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:  OnlineClient oc=new OnlineClient();
      	  oc.main(null);
            	break;
                default:System.out.println("Thanks for Using This APP");
            }

 

        }
    }}
