package com.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String uname=request.getParameter("uname");
	String upwd=request.getParameter("upwd");
	out.println("<html>");
	out.println("<body>");
	out.println("<font color='red' size='6'");
	if(uname.equals("rani")&&upwd.equals("rani"))
	{
		
		out.println("login success");
		
	}
	
	else
	{
		out.println("login failure");
	}
	out.println("</font >");
	out.println("<a href='./loginform.html'>Login Form</a>");
	out.println("</body>");
	
	out.println("</html>");
	}

}
