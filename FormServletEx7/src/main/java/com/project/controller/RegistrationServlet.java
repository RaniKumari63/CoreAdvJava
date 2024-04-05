package com.project.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.product.Dao.UserDao;
import com.product.DaoImpl.UserDaoImpli;
import com.product.model.UserService;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	UserDao daoimpl=new UserDaoImpli();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		String uemail=request.getParameter("uemail");
		long umobile=Long.parseLong(request.getParameter("umobile"));
		UserService us=new UserService(uname,upwd,uemail,umobile);
		String status=daoimpl.registration(us);
		out.println("<html>");
		out.println("<body bgcolor='lightblue'>");
		out.println("<center><br><br>");
		out.println("<font color='red' size='7'>");
		if(status.equals("success")){
		out.println("Registration Success");
		}
		if(status.equals("failure")){
		out.println("Registration Failure");
		}
		if(status.equals("existed")){
		out.println("User Existed Already");
		}
		out.println("</font></center></body></html>");
		}
	
	}


