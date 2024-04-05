package advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test6 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub

		
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ranidb","root","ranikumari");
		st=con.createStatement();
		int count=st.executeUpdate("delete from student where sno=12");
		System.out.println(count+"records affected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
