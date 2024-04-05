package com.suchiit.Dao;

import java.util.List;

import com.suchiit.model.Student;

public interface StudentDao {

	boolean registerStudent(Student stu);
	List<Student> viewallStudents();
	Student viewStudent(int sno);
	
	boolean updateStudent(Student stu);
	boolean deleteStudent(int sno);
}
