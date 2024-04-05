package com.suchiit.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
public class SecondServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String uqual=request.getParameter("uqual");
		String udesig=request.getParameter("udesign");
		HttpSession hs=request.getSession();
		hs.setAttribute("uqual", uqual);
		hs.setAttribute("udesign", udesig);
		RequestDispatcher rd=request.getRequestDispatcher("form3.html");
		rd.forward(request, response);

		
		
	}
	
}
