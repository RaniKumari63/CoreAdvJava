package com.Association1;

public class ManytoOneEx {

	

		public static void main(String args[]){ 
			Branch branch=new Branch("B-111","CS"); 
			Student std1=new Student("S-111","AAA","Hyd",branch); 
			Student std2=new Student("S-222","BBB","Hyd",branch); 
			Student std3=new Student("S-333","CCC","Hyd",branch); 
			std1.getStudentDetails(); 
			std2.getStudentDetails(); 
			std3.getStudentDetails(); 
	}

}
