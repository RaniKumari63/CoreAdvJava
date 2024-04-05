package advjava;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

public class DataBaseMetaEx {
public static void main(String[] args)
{Connection con=null;
	try
	{con=ConnectionManager.getConnection();
	DatabaseMetaData dsmd=con.getMetaData();
	System.out.println();
	
	}catch(SQLException e)
	{
		e.printStackTrace();
	}
}
}
