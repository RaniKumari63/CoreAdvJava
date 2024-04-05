package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suchiit.dao.UserDao;
import com.suchiit.daoimpl.UserDaoImpl;



/**
 * Servlet implementation class ForgotPasswordServlet
 */
public class ForgotPasswordServlet extends HttpServlet {
	
		UserDao userdaoimpl=new UserDaoImpl();
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			String email=request.getParameter("email");
			String password=userdaoimpl.getPassword(email);
			if(password.equals("null"))
			{
				out.println("Please Enter Valid Email");
				out.println("<a href=Login1.html>Login</a>");
				
			}
			else
			{out.println("password"+"\t"+password);
			}
		}

	}


