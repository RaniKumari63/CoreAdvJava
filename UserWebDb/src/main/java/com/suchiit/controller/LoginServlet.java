package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suchiit.Dao.UserDao;
import com.suchiit.DaoImpl.UserDaoImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
UserDao userdaoimpl=new UserDaoImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
response.setContentType("text/html");
		String uname=request.getParameter("email");
		String pwd=request.getParameter("pwd");
		boolean flag=userdaoimpl.validEmailAndPassWord(uname, pwd);
		PrintWriter out=response.getWriter();
		if(flag==true)
		{
		out.println("<html>");
		out.println("<body>");
		 out.println("<table>");
		 out.println("<tr>");
		 out.println("<a href='./prodregistration.html'>AddProducts</a>");
		 out.println("</tr>");
		 out.println("<tr><br><br>");
		 out.println("<a href='view'>ViewAllProducts</a>");
		 out.println("</tr>");
		 out.println("<tr><br><br>");
		 out.println("<a href='viewone1.html'>ViewProduct</a>");
		 out.println("</tr>");
		 out.println("<tr><br><br>");
		 out.println("<a href=Login1.html>Login</a>");
		 out.println("</tr>");
		 out.println("</table>");
		
		out.println("</body>");
		out.println("</html>");
		}
		else
			{out.println("Login Failure,Please Enter Valid Username and Password");
		out.println("<a href=Login1.html>Login</a>");
			}	
	}

}
