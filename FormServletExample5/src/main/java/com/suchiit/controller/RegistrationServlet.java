package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int sno=Integer.parseInt(request.getParameter("sno"));
		String sname=request.getParameter("sname");
		String sadd=request.getParameter("sadd");
		PrintWriter pw=null;
		pw=response.getWriter();
		pw.println(sno+"\t"+sname+"\t"+"\t"+sadd);
	}

	

}
