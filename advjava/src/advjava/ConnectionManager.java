package advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionManager {
	
public static Connection getConnection() throws SQLException
{
	DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ranidb", "root", "ranikumari");
	
	
	return con;
}

public static void closeConnection(Connection con,Statement st) throws SQLException
{if(st!=null)
	st.close();
if(con!=null)
	con.close();
}

public static void closeConnection(Connection con,Statement st,ResultSet rs) throws SQLException
{ if(rs!=null)
	rs.close();
	if(st!=null)
	st.close();
if(con!=null)
	con.close();
}

public static void closeConnection(Connection con,PreparedStatement ps) throws SQLException
{if(ps!=null)
	ps.close();
if(con!=null)
	con.close();
}
public static void closeConnection(Connection con,PreparedStatement ps,ResultSet rs) throws SQLException
{ if(rs!=null)
	rs.close();
	if(ps!=null)
	ps.close();
if(con!=null)
	con.close();
}
}
