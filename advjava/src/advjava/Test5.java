package advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test5 {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ranidb","root","ranikumari");
		st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		rs=st.executeQuery("select * from employee");
		rs.absolute(3);
		System.out.println(rs.getInt(1)+"\t "+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4));
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
