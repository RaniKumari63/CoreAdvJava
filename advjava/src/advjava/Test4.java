package advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ranidb","root","ranikumari");
		if(con!=null)
			System.out.println("Connection is established");
		else
			System.out.println("connection not established");
		ps=con.prepareStatement("insert into student values(?,?,?)");
		ps.setInt(1,12);
		ps.setString(2, "lll");
		ps.setString(3,"hyd");
		int count=ps.executeUpdate();
		if(count!=0)
		{
			System.out.println("Data Inserted Successfully");
		}
		else
		{
			System.out.println("data not inserted successfully");
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			
			if(ps!=null)
				try {
					ps.close();
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
