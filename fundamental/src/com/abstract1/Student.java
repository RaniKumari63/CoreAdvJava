 package com.abstract1;

public abstract class Student {

	private int Studentid;
	private String Name;
	private long MobileNo;
	private String Address;
	private  String Course;
	public Student(int studentid, String name, long mobileNo, String address, String course) {
		super();
		Studentid = studentid;
		Name = name;
		MobileNo = mobileNo;
		Address = address;
		Course = course;
	}
	public void setStudentid(int studentid) {
		Studentid = studentid;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public void setCourse(String course) {
		Course = course;
	}
	
	public int getStudentid() {
		return Studentid;
	}
	public String getName() {
		return Name;
	}
	public long getMobileNo() {
		return MobileNo;
	}
	public String getAddress() {
		return Address;
	}
	public String getCourse() {
		return Course;
	}
	public abstract int calculateFee(String course);
}
