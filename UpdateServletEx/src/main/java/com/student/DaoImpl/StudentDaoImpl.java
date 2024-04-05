package com.student.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.student.config.ConnectionManager;
import com.student.model.Student;

public class StudentDaoImpl {
	Connection con=null;
	PreparedStatement ps=null;;
	ResultSet rs;
	String status="";
	Student st;
	public StudentDaoImpl() {
	try {
	con=ConnectionManager.getConnection();

	} catch (Exception e) {
	e.printStackTrace();
	}
	}

	public Student getStudent(int sno){
	try {con.prepareStatement("select * from student where sid=?");
	ps.setInt(1, sno);
	
	rs=ps.executeQuery();
	boolean b=rs.next();
	if(rs.next()){
	st=new Student();
	st.setSno(rs.getInt(1));
	st.setSname(rs.getString(2));
	st.setSadd(rs.getString(3));
	}else{
	st=null;
	}
	} catch (Exception e) {
	}
	return st;
	}
	
	public String update(int sno, String sname, String saddr){
		try {con.prepareStatement("update student set sname=?,saddr=? where sno=?");
		ps.setString(1, sname);
		ps.setString(2, saddr);
		ps.setInt(3, sno);
		ps.executeUpdate();
		status="success";
		} catch (Exception e) {
		status="failure";
		e.printStackTrace();
		}
		return status;
		}
	
	
}
