package advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test9 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/3306","root","ranikumari");
PreparedStatement ps=con.prepareStatement("select * from employee");
	}

}
