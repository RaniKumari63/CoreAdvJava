package com.pms.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionManager {

	public static Connection getConnection() throws SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pms", "root", "ranikumari");
		return con;
	}//end of getConnection()

	public static void closeConnection(Connection con, PreparedStatement ps) throws SQLException
   {
		if(ps!=null)
			ps.close();
		if(con!=null)
			con.close();

	}//end of closeConnection()
	
	
	public static void closeConnection(Connection con,PreparedStatement ps,ResultSet rs) throws SQLException
	{
		if(rs!=null)
			rs.close();
		if(ps!=null)
			ps.close();
		if(con!=null)
			con.close();
	}
}
