package com.suchiit.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.suchiit.Dao.StudentDao;
import com.suchiit.DaoImpl.StudentDAOImpl;
import com.suchiit.model.Student;


public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int no=Integer.parseInt(request.getParameter("sno"));
		StudentDao daoimpl=new StudentDAOImpl();
		Student student=daoimpl.viewStudent(no);
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<form action='update'>");
		out.println("<table>");
		out.println("<tr><td>Sno</td>");
		out.println("<td><input type='hidden' name='sno' value="+student.getSno()+"></td></tr>");
		out.println("<tr><td>Sname</td>");
		out.println("<td><input type='text' name='sname' value="+student.getSname()+"></td></tr>");
		out.println("<tr><td>Saddr</td>");
		out.println("<td><input type='text' name='sadd' value="+student.getSadd()+"></td></tr>");
		
		out.println("<tr><td><input type='submit' value='update'/>");
		out.println("</table>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

}
