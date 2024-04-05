package advjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test7 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ranidb","root","ranikumari");
PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
ps.setInt(1,8);
ps.setString(2, "yyy");
ps.setString(3, "viz");
ps.setString(4, "teacher");
int count=ps.executeUpdate();
ps=con.prepareStatement("update employee set ename=? where eno=?");
ps.setString(1,"sss");
ps.setInt(2, 6);
int count1=ps.executeUpdate();
System.out.println(count+"record inserted");
con.close();	
	}

}
