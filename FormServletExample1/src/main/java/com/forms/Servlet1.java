package com.forms;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		Enumeration<String> e=request.getHeaderNames();
		out.println("<html>");
		out.println("<body>");
		out.println("<h2>request headers data</h2>");
		out.println("<table border='1'");
		out.println("<tr><td align='center'><h3>Header name</h3><td=align='center'><h3><header value</h3></td></tr>");
		while(e.hasMoreElements())
		{
			String name=(String)e.nextElement();
			String value=request.getHeader(name);
		out.println("<tr><td>"+name+"</td><td>"+value+"</td></tr>");
		}
		out.println("</table>");
		out.println("</html>");
		out.println("</body>");
		
		}
		
	}


