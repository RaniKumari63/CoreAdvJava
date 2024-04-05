package advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;
		Statement st=null;
		ResultSet rs=null;
		ResultSetMetaData rmd=null;
try {
	DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ranidb", "root","ranikumari");
	st=con.createStatement();
	String query="select * from student";
	rs=st.executeQuery(query);
	rmd=rs.getMetaData();
	System.out.println(rmd.getColumnLabel(1)+"\t"+rmd.getColumnLabel(2)+"\t"+rmd.getColumnLabel(3));
	while(rs.next())
	{
		int sno=rs.getInt(1);
		String sname=rs.getString(2);
		String sadd=rs.getString(3);
		System.out.println(sno+"\t"+sname+"\t"+sadd);
		
		
	}
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
finally {
	
	if(rs!=null)
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
