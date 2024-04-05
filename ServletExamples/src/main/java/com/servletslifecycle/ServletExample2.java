package com.servletslifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class ServletExample2
 */
public class ServletExample2 extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see GenericServlet#GenericServlet()
     */
    public ServletExample2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	response.setContentType("text/html");
	PrintWriter out=response.getWriter();
	out.println("<html>");
	out.println("<body>");
	out.println("<font color='red' size='6'>");
	out.println("<b>");
	out.println("Welcome ");
	out.println("<hr>");
	out.println("</b></font></body></html>");
	
	}
	
	

}
