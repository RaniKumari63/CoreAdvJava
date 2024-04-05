package com.suchii.controlller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletEx1
 */
public class ServletEx1 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		ServletConfig config=getServletConfig();
		
		ServletContext context=request.getServletContext();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("a->"+context.getInitParameter("a")); 
		out.println("b->"+context.getInitParameter("b")); 
		out.println("c->"+config.getInitParameter("c")); 
		out.println("d->"+config.getInitParameter("d")); 
		out.println("e->"+config.getInitParameter("e")); 
		out.println("f->"+config.getInitParameter("")); 
		
	}

}
