package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suchiit.DaoImpl.StudentDAOImpl;
import com.suchiit.model.Student;

/**
 * Servlet implementation class ViewAllServlet
 */
public class ViewAllServlet extends HttpServlet {
	
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
			StudentDAOImpl	daoimpl=new StudentDAOImpl();
			List<Student> viewStudents=daoimpl.viewallStudents();
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			out.println("<a href='student2.html'>AddStudent</a>");
				out.println("<table border='1' width=100%>");
				
		out.println("<tr><th>SNO</th><th>SNAME</th><th>SADD</th><th>EDIT</th><th>DELETE</th></tr>");
		for(Student st:viewStudents)
		{

		out.println("<tr><td>"+st.getSno()+"</td><td>"+st.getSname()+"</td><td>"+st.getSadd()+
				"</td><td><a href='edit?sno="+st.getSno()+"'>Edit</a></td><td><a href='delete?sno="+st.getSno()+"'>Delete</a></td></tr>");
		}
			out.println("</table>");
			}

	

}
