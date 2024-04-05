package com.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	String sname=request.getParameter("sname");
	String sid=request.getParameter("sid");
	String []qual=request.getParameterValues("squal");
	String squal="";
	for(int i=0;i<qual.length;i++)
	{
		squal=squal+qual[i]+" ";
	}
	
	String sgender=request.getParameter("sgender");
	String[] techs=request.getParameterValues("stech");
	String stech="";
	for(int i=0;i<techs.length;i++)
	{
		stech=stech+techs[i]+" ";
	}
	
	String branch=request.getParameter("branch");
	String saddr=request.getParameter("saddr");
	out.println("<html>");
	out.println("<body>");
	out.println("<h2>Registration</h2>");
	out.println("<h3>Student Course Registration Details</h3>");
	out.println("<table border='1'>");
	out.println("<tr><td>Student Id</td><td>"+sid+"</td></tr>");
	out.println("<tr><td>Student Name</td><td>"+sname+"</td></tr>");
	out.println("<tr><td>Student Qualification</td><td>"+squal+"</td></tr>");
	out.println("<tr><td>Student Gender</td><td>"+sgender+"</td></tr>");
	out.println("<tr><td>Student Technologies</td><td>"+stech+"</td></tr>");
	out.println("<tr><td>Branch</td><td>"+branch+"</td></tr>");
	out.println("<tr><td>Student Address</td><td>"+saddr+"</td></tr>");
	out.println("</table></body></html>");
	
	
	}
	
	
	

}
