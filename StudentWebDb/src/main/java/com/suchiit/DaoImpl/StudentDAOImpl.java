package com.suchiit.DaoImpl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.suchiit.Dao.StudentDao;
import com.suchiit.config.ConnectionManager;
import com.suchiit.model.Student;
import com.suchiit.query.QueryConstant;

public class StudentDAOImpl implements StudentDao {
Connection con=null;
PreparedStatement ps=null;
ResultSet rs=null;
boolean flag=false;

	public boolean registerStudent(Student stu) {
		// TODO Auto-generated method stub
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstant.INSERT_STU);
			ps.setInt(1,stu.getSno() );
			ps.setString(2,stu.getSname());
			ps.setString(3,stu.getSadd());
			
			int count=ps.executeUpdate();
			System.out.println(count);
			if(count!=0)
				flag=true;
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				ConnectionManager.closeConnection(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}

	public List<Student> viewallStudents() {
		List<Student>addStudent=new ArrayList<Student>();
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstant.SELECT_QUERY);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				Student student=new Student(rs.getInt(1),rs.getString(2),rs.getString(3));
				addStudent.add(student);
			
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				ConnectionManager.closeConnection(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return addStudent;
	}

	public Student viewStudent(int sno) {
		
		Student student=null;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstant.SELECT_SPECIFIC_QUERY);
			
			ps.setInt(1,sno );
			rs=ps.executeQuery();
			if(rs.next())
			{
			 student=new Student(rs.getInt(1),rs.getString(2),rs.getString(3));
				
			
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				ConnectionManager.closeConnection(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return student;
	}
	public boolean updateStudent(Student stu) {
		// TODO Auto-generated method stub
		boolean flag=false;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstant.UPDATE_QUERY);
			
			ps.setString(1,stu.getSname());
			ps.setString(2,stu.getSadd());
			ps.setInt(3, stu.getSno());
			int count=ps.executeUpdate();
			
			if(count!=0)
				flag=true;
					
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				ConnectionManager.closeConnection(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}

	public boolean deleteStudent(int sno) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Student student=null;
		boolean flag=false;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstant.DELETE_QUERY);
			
			ps.setInt(1,sno );
			int count=ps.executeUpdate();
			if(count!=0)
				flag=true;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				ConnectionManager.closeConnection(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}


}
