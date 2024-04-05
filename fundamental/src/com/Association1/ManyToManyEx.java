package com.Association1;

public class ManyToManyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course c1=new Course("C-111","C",500); 
		Course c2=new Course("C-222","C++",1000); 
		Course c3=new Course("C-333","JAVA",5000); 
		Course[] crs=new Course[3]; 
		crs[0]=c1; 
		crs[1]=c2; 
		crs[2]=c3; 
		Student1 std1=new Student1("S-111","AAA","Hyd",crs); 
		Student1 std2=new Student1("S-222","BBB","Hyd",crs); 
		Student1 std3=new Student1("S-333","CCC","Hyd",crs); 
		std1.getStudentDetails(); 
		std2.getStudentDetails(); 
		std3.getStudentDetails(); 
	}

}
