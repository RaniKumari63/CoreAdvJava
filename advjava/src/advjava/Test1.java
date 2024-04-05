package advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection con=null;
Statement st=null;
		try {
			con=ConnectionManager.getConnection();
		 if(con!=null)
			 System.out.println("Connection Established");
		 else
			 System.out.println("Connection not Established");
		
		 
		 st=con.createStatement();
		 String query="insert into student values(11,'ffff','viz')";
		 int count=st.executeUpdate(query);
		if(count!=0) 
			System.out.println("data inserted success fully");
		else
			System.out.println("data not inserted success fully");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				ConnectionManager.closeConnection(con, st);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
