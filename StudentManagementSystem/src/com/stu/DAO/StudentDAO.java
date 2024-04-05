package com.stu.DAO;

import java.util.List;

import com.stu.pojo.Student;

public interface StudentDAO {

	void addStudent();
	List<Student> viewAllStudent();
	Student viewStudent(int sno);
	int deleteStudent(int sno);
	void updateStudent(int sno);
}
