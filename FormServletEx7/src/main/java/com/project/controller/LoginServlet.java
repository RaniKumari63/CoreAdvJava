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
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	UserDao daoimpl=new UserDaoImpli();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String uname=request.getParameter("uname");
		String upwd=request.getParameter("upwd");
		UserService us=new UserService();
		
		String status=daoimpl.checkLogin(uname,upwd);
		out.println("<html>");
		out.println("<body bgcolor='lightblue'>");
		out.println("<center><br><br>");
		out.println("<font color='red' size='7'>");
		if(status.equals("success")){
		out.println("Login Success");
		}
		if(status.equals("failure")){
		out.println("Login Failure");
		}	
		out.println("</font></center></body></html>");

		
		
		// TODO Auto-generated method stub
	}

}
