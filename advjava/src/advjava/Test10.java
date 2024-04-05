package advjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con=null;Statement st=null;
try {
	con=ConnectionManager.getConnection();
	 st=con.createStatement();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter table name");
	String tname=br.readLine();
String sql="create table\t"+tname+ "(eno int,ename varchar(10),esal int)";
st.executeUpdate(sql);
System.out.println("table created successfully");

} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	
} catch (IOException e) {
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
