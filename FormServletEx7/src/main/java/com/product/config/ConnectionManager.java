package com.product.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionManager {

	public static Connection getConnection() throws ClassNotFoundException, FileNotFoundException, IOException, SQLException
	{
	Properties pro=new Properties();
	System.out.println("rewqrewferwgrtgtrh");
	pro.load(new FileInputStream("C://Users//neral//eclipse-workspace//FormServletEx7//src//main//java//com//product//props//app.properties"));
	System.out.println("rewqrewferwgrtgtrh");
	Class.forName((String)pro.get("DriverClass"));	
	System.out.println("rewqrewferwgrtgtrh");
	Connection con=DriverManager.getConnection(pro.getProperty("DriverUrl"),pro.getProperty("uname"),pro.getProperty("pwd"));
	
	return con;
	}

public static  void closeConnection(Connection con,PreparedStatement ps) throws SQLException
{ if(con!=null)
	con.close();
 if(ps!=null)
		 ps.close();
	
}

public static  void closeConnection(Connection con,PreparedStatement ps,ResultSet rs) throws SQLException
{ if(con!=null)
	con.close();
 if(ps!=null)
		 ps.close();
 if(rs!=null)
	 rs.close();
	
}
}
