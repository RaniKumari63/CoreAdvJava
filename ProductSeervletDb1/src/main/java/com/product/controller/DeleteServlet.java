package com.product.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.product.DaoImpl.Productdaoimpl;
import com.product.dao.ProductDao;

/**
 * Servlet implementation class DeleteServlet
 */
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		ProductDao daoimpl=new Productdaoimpl();
boolean flag=daoimpl.deleteProduct(pid);
		
RequestDispatcher rd=null;
if(flag)
{
	rd=request.getRequestDispatcher("/view");
	rd.forward(request, response);
}
else
{ 
	rd=request.getRequestDispatcher("/register.html");
   rd.forward(request, response);
	
}
	}

}
