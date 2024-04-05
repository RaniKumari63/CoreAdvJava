package com.form;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
protected void doPost(HttpServletRequest req,HttpServletResponse res)throws
 ServletException,IOException{
	res.setContentType("text/html");
	PrintWriter out=res.getWriter();
	String sid=req.getParameter("sid");
	String sname=req.getParameter("sname");
	String[] squal=req.getParameterValues("squal");
	String sgender=req.getParameter("sgender");
	String[] stech=req.getParameterValues("stech");
	String branch=req.getParameter("branch");
	String saddr=req.getParameter("saddr");
	String qual="";
	for(int i=0;i<squal.length;i++){
	qual=qual+squal[i]+"<br>";
	}
	String tech="";
	for(int j=0;j<stech.length;j++){
	tech=tech+stech[j]+"<br>";
	}
	
}

}
