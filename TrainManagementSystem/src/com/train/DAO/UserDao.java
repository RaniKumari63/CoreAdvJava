package com.train.DAO;

import java.util.ArrayList;
import java.util.List;

import com.train.pojo.Passenger;
import com.train.pojo.User;

public interface UserDao {

	void addUser();
	void verifyUser();
	void addPassenger(int uno);
	
	List<User> user=new ArrayList<User>();
	List<Passenger> passenger=new ArrayList<Passenger>();
	List<Passenger> selectpassenger1=new ArrayList<Passenger>();
	List<Passenger> viewAllPassengers(int uno,String uname);
	void bookTickets();
	void payAmount();
	boolean trainAvaliability(String sst,String dst,String date1,String classes);
	
	
}
