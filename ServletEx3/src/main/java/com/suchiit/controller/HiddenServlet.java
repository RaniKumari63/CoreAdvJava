package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HiddenServlet
 */
public class HiddenServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		ServletContext context=getServletContext();
		PrintWriter out=response.getWriter();
		String fname=request.getParameter("fname");
		String lname=request.getParameter("lname");
		// context.setAttribute("fname", fname);
		// context.setAttribute("lname", lname);
		  out.println("<html>"); 
		  out.println("<body>");
		  out.println("<form action=second>");
		  out.println("input type=hidden name='fname' value="+fname+">");
		  out.println("input type=hidden name='lname' value="+lname+">");
		 
		  out.println("input type=text name='city' placeholder='Enter City Name'");
		  out.println("input type=text name='country' placeholder='Enter Country Name'");
		 
		  out.println("input type='submit'name='click'"); 
		  out.println("</form>");
		  out.println("</body>"); 
		  out.println("</html>");
		 
		/*
		 * request.setAttribute("lname", lname); request.setAttribute("fname", fname);
		 * RequestDispatcher rd=request.getRequestDispatcher("/second");
		 * rd.forward(request, response);
		 */
	}

}
