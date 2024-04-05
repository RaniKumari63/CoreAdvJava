package com.servletslifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletExample1 extends GenericServlet {
  public void init(ServletConfig config)throws ServletException
  {
	  
  }
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
res.setContentType("text/html");
PrintWriter out=res.getWriter();

out.println("<html>");
out.println("<body>");
out.println("<font color='red' size='6'>");
out.println("<b>welcome</b> ");
out.println("</font></body></html>");
	}
	
	public void destroy()
	{
		
	}
	
	public ServletConfig  getServletConfig()
	{
		return null;
	}

}
