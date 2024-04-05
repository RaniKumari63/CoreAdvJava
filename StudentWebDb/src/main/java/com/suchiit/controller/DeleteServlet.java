package com.suchiit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suchiit.Dao.StudentDao;
import com.suchiit.DaoImpl.StudentDAOImpl;

/**
 * Servlet implementation class DeleteServlet
 */
public class DeleteServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int no=Integer.parseInt(request.getParameter("sno"));
		StudentDao daoimpl=new StudentDAOImpl();
	boolean flag=daoimpl.deleteStudent(no);
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
