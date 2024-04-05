package com.product.DaoImpl;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.product.Dao.UserDao;
import com.product.config.ConnectionManager;
import com.product.model.UserService;
import com.product.query.QueryConstant;

public class UserDaoImpli  implements UserDao{
  Connection con=null;
  PreparedStatement ps=null;
  ResultSet rs=null;
	public String checkLogin(String uname, String upwd) {
		// TODO Auto-generated method stub
		String status=null;
		try {
			con=ConnectionManager.getConnection();
		
			ps=con.prepareStatement(QueryConstant.SELECT_UNAME_PWD_QUERY);
			ps.setString(1, "uname");
			ps.setString(2, "upwd");
			rs=ps.executeQuery();
			if(rs.next())
				status="success";
			else
			{
				status="failure";
			}
			
			System.out.println(status);
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
				ConnectionManager.closeConnection(con, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return status;
	}

	public String registration(UserService us) {
		// TODO Auto-generated method stub
		String status=null;
		int count=0;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstant.SELECT_UNAME_QUERY);
			ps.setString(1,us.getUname());
			rs=ps.executeQuery();
			if(rs.next())
				status="existed";
			else
			{ps=con.prepareStatement(QueryConstant.INSERT_QUERY);
			ps.setInt(1, 1);
			ps.setString(1, us.getUname());
			ps.setString(2, us.getUpwd());
			ps.setString(3, us.getUpwd());
			ps.setLong(4, us.getUmobile());
				count =ps.executeUpdate();
				if(count!=0)
					status="success";
				else
					status="failure";
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
				ConnectionManager.closeConnection(con, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return status;
	}

	
	
}
