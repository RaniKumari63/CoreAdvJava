package com.abstract11;

public abstract class Student {
int StudentId;
String Name;
long MobileNo;
String Address;
String Course;
public int getStudentId() {
	return StudentId;
}
public void setStudentId(int studentId) {
	StudentId = studentId;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public long getMobileNo() {
	return MobileNo;
}
public void setMobileNo(long mobileNo) {
	MobileNo = mobileNo;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getCourse() {
	return Course;
}
public void setCourse(String course) {
	Course = course;
}
public Student(int studentId, String name, long mobileNo, String address, String course) {
	super();
	StudentId = studentId;
	Name = name;
	MobileNo = mobileNo;
	Address = address;
	Course = course;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
void Validate()

{ 
	
	int mobileno1=(int) (MobileNo);
	if((Name.length()>15)){
	
}
	
	
}
	abstract int CalculateFee();
	
}
