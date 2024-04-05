package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suchiit.DaoImpl.Productdaoimpl;
import com.suchiit.Dao.ProductDao;
import com.suchiit.model.Product;

/**
 * Servlet implementation class ProductRegistrationServlet
 */
public class ProductRegistrationServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String pname=request.getParameter("pname");
		int pqty=Integer.parseInt(request.getParameter("pqty"));
		int pprice=Integer.parseInt(request.getParameter("pprice"));
		Product pro=new Product(pname,pqty,pprice);
		ProductDao daoimpl=new Productdaoimpl();
		boolean flag=daoimpl.registerProducts(pro);
		
		if(flag)
		{
			out.println("Product Inserted Successfully");
			out.println("<a href=Login1.html>Home</a>");
			out.println("<a href='prodregistration.html'>Back</a>");
		}
		else
		{
			out.println("Product Not Inserted Successfully");
			out.println("<a href=Login1.html>Home</a>");
		}
	}

}
