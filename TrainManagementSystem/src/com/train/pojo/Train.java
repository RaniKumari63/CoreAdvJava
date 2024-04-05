package com.train.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Train {
	private int tno;
	private String tname;
	private Map<Integer,Stations> stations=new 	HashMap<Integer,Stations>();
	private String d;
	private String reservationtype;
	private List<Classes> classes=new ArrayList<Classes>();
	
	public Train(int tno, String tname, Map<Integer, Stations> stations, String d, 
			List<Classes> classes) {
		super();
		this.tno = tno;
		this.tname = tname;
		this.stations = stations;
		this.d = d;
		this.reservationtype = reservationtype;
		this.classes = classes;
		
	}
	public List<Classes> getClasses() {
		return classes;
	}
	public void setClasses(List<Classes> classes) {
		this.classes = classes;
	}
	
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public Train(int tno, String tname, Map<Integer, Stations> stations, String d, String reservationtype) {
		super();
		this.tno = tno;
		this.tname = tname;
		this.stations = stations;
		this.d = d;
		this.reservationtype = reservationtype;
	}
	public String getReservationtype() {
		return reservationtype;
	}
	public void setReservationtype(String reservationtype) {
		this.reservationtype = reservationtype;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Map<Integer, Stations> getStations() {
		return stations;
	}
	public void setStations(Map<Integer, Stations> stations) {
		this.stations = stations;
	}
	public String getD() {
		return d;
	}
	public void setD(String d) {
		this.d = d;
	}
	public Train(int tno, String tname, Map<Integer, Stations> stations, String d) {
		super();
		this.tno = tno;
		this.tname = tname;
		this.stations = stations;
		this.d = d;
	}
	public Train() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
