package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suchiit.dao.UserDao;
import com.suchiit.daoimpl.UserDaoImpl;
import com.suchiit.model.User;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
UserDao userdaoimpl=new UserDaoImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int uid=Integer.parseInt(request.getParameter("uid"));
		String uname=request.getParameter("uname");
		String password=request.getParameter("pwd");
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		long mobilenumber=Long.parseLong(request.getParameter("mobilenumber"));
		User user=new User(uid,fname,lname,uname,mobilenumber,password);
		boolean flag=userdaoimpl.register(user);
		if(flag)
		{
			out.println("User Account Created");
			
		}
		else
		{
			out.println("Unable to Create Account");
			
		}
	}

}
