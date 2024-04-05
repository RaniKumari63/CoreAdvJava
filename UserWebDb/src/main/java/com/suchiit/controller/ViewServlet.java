package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suchiit.Dao.ProductDao;
import com.suchiit.DaoImpl.Productdaoimpl;
import com.suchiit.model.Product;

/**
 * Servlet implementation class ViewServlet
 */
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         ProductDao daoimpl=new Productdaoimpl();
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		List<Product> viewallproducts=daoimpl.viewAllProducts();
		
		
		out.println("<html>");
		out.println("<body>");
		
		out.println("<a href='prodregistration.html'>AddProducts</a>");
		out.println("<table border='1' width=100% >");
		out.println("<th>PID</th><th>PNAME</th><th>PQty</th><th>PPRICE</th><th>EDIT</th><th>DELETE</th>");
		for(Product p:viewallproducts)
		{
			out.println("<tr><td>"+p.getPid()+"</td><td>"+p.getPname()+"</td><td>"+p.getPqty()+"</td><td>"+p.getPprice()+"</td><td><a href='update?pid="+p.getPid()+"'>Edit</a></td><td><a href='delete?pid="+p.getPid()+"'>Delete</a></td><tr>");
			
		}
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

}
