package com.train.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.train.pojo.Classes;

import com.train.pojo.Stations;
import com.train.pojo.Train;

public interface AdminDao {

	List<Train> train=new ArrayList<Train>();
	List<Classes> classes1=new ArrayList<Classes>();
	
	
	Map<Integer,Stations> stations=new HashMap<Integer,Stations>();
	void addStations();
	void addClasses();
	void addTrainInfo();
	List<Train>viewAllTrainInfo();
	Train viewTrainInfo(int trainno);

	void updateTrainInfo(int trainno);
	boolean verifyUserAndPw(String username,String pw);
	void deleteTrainInfo(int trainno);
	void viewBookedTicket();
	void viewHelpReport();
	void print();
	void pdf();
	
	

}
