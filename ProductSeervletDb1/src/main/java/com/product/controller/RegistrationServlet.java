package com.product.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.product.DaoImpl.Productdaoimpl;
import com.product.dao.ProductDao;
import com.product.model.Product;



/**
 * Servlet implementation class RegistrationServlet
 */
public class RegistrationServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String pname=request.getParameter("pname");
		int pqty=Integer.parseInt(request.getParameter("pqty"));
		int pprice=Integer.parseInt(request.getParameter("pprice"));
		Product pro=new Product(pname,pqty,pprice);
		ProductDao daoimpl=new Productdaoimpl();
		boolean flag=daoimpl.registerProducts(pro);
		System.out.println(flag);
		if(flag)
		{
			out.println("Product Inserted Successfully");
			out.println("<a href=register.html>Home</a>");
		}
		else
		{
			out.println("Product Not Inserted Successfully");
			out.println("<a href=register.html>Home</a>");
		}
	}

}
