package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suchiit.Dao.StudentDao;
import com.suchiit.DaoImpl.StudentDAOImpl;
import com.suchiit.model.Student;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html");
	  PrintWriter out=response.getWriter();
	  
		int sno=Integer.parseInt(request.getParameter("sno"));
		String sname=request.getParameter("sname");
		String sadd=request.getParameter("sadd");
		Student stu=new Student(sno,sname,sadd);
		StudentDao daoimpl=new StudentDAOImpl();
		boolean flag=daoimpl.registerStudent(stu);
		
		if(flag)
		{
			out.println("Student Registered Successfully");
			out.println("<a href=student.html>Home</a>");
		}
		else
		{
			out.println("Student Not Registered Successfully");
			out.println("<a href=student.html>Home</a>");
		}
	}

	

}
