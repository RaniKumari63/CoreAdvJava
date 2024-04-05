package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfigEx1
 */
public class ServletConfigEx1 extends HttpServlet {
	
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		ServletConfig config=getServletConfig();
		String logicalName=config.getServletName();
		String driver=config.getInitParameter("driver");
		String name=config.getInitParameter("name");
		
		out.println("<html><body><h1>");
		out.println("Logical Name: "+logicalName+"<br><br>");
		out.println("Driver : "+driver+"<br><br>");
		
		out.println("name : "+name+"<br><br>");
		out.println("</h1></body></html>");

	}

}
