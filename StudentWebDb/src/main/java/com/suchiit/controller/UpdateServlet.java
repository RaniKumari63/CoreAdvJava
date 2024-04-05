package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suchiit.Dao.StudentDao;
import com.suchiit.DaoImpl.StudentDAOImpl;
import com.suchiit.model.Student;

/**
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sno=Integer.parseInt(request.getParameter("sno"));
		String sname=request.getParameter("sname");
		String sadd=request.getParameter("sadd");
		Student stu=new Student(sno,sname,sadd);
		StudentDao daoimpl=new StudentDAOImpl();
		boolean flag=daoimpl.updateStudent(stu);
				response.setContentType("text/html");
				PrintWriter out=response.getWriter();
				RequestDispatcher rd=null;
				if(flag)
				{
			  rd=request.getRequestDispatcher("/ViewAllServlet"); 
				rd.forward(request, response);
				}
				else
				{ rd=request.getRequestDispatcher("/student2.html"); 
				rd.forward(request, response);
					
				}
	}

}
