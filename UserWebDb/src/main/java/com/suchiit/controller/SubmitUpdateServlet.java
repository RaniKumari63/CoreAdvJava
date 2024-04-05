package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suchiit.DaoImpl.Productdaoimpl;
import com.suchiit.Dao.ProductDao;
import com.suchiit.model.Product;

/**
 * Servlet implementation class SubmitUpdateServlet
 */
public class SubmitUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		String pname=request.getParameter("pname");
		int pqty=Integer.parseInt(request.getParameter("pqty"));
		int pprice=Integer.parseInt(request.getParameter("pprice"));
		Product product=new Product(pid,pname,pqty,pprice);
		ProductDao daoimpl=new Productdaoimpl();
		boolean flag=daoimpl.updateProduct(product);
		RequestDispatcher rd=null;
		if(flag)
		{
			rd=request.getRequestDispatcher("view");
			rd.forward(request, response);
		}
		else
		{ 
			rd=request.getRequestDispatcher("/register.html");
		   rd.forward(request, response);
			
		}
	}
}
