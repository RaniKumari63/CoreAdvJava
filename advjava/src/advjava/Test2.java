package advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection con=null;
		Statement st=null;
	try {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ranidb", "root", "ranikumari");
		if(con!=null)
			System.out.println("connection established");
		else
			System.out.println("connection not established");
		 st=con.createStatement();
		 String query="update  student set sname='www' where sno=1";
		 int count=st.executeUpdate(query);
		if(count!=0) 
			System.out.println("data updated success fully");
		else
			System.out.println("data not updated success fully");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		if(st!=null)
			try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		if(con!=null)
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	}

}
