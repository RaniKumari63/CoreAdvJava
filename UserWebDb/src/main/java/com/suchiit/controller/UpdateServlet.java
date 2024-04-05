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
 * Servlet implementation class UpdateServlet
 */
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int pid=Integer.parseInt(request.getParameter("pid"));
		ProductDao daoimpl=new Productdaoimpl();
		Product product=daoimpl.viewProduct(pid);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<form action='submitupdate'>");
		out.println("<table>");
		out.println("<tr><td>PID</td></tr>");
		
		  out.println("<td><input type='hidden' name='pid' value="+product.getPid()+
		  "></td></tr>"); out.println("<tr><td>PNAME</td>");
		  out.println("<td><input type='text' name='pname' value="+product.getPname()+
		  "></td></tr>");
		  
		  out.println("<tr><td>PQTY</td>");
		  out.println("<td><input type='text' name='pqty' value="+product.getPqty()+
		  "></td></tr>"); out.println("<tr><td>PPRICE</td>");
		  out.println("<td><input type='text' name='pprice' value="+product.getPprice()
		  +"></td></tr>");
		  out.println("<tr><td><input type='submit' value='update'/></td></tr>");
		 
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
	        
	}

}
