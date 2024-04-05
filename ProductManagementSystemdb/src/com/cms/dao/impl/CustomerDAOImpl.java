package com.cms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cms.dao.CustomerDAO;
import com.cms.model.Customer;

import com.pms.config.ConnectionManager;
import com.pms.model.Product;
import com.pms.query.QueryConstants;

public class CustomerDAOImpl implements CustomerDAO{

	@Override
	public int addCustomers(Customer cus) {
		// TODO Auto-generated method stub
		int count=0;
	Connection con=null;
	PreparedStatement ps=null;
	try {
		con=ConnectionManager.getConnection();
		ps=con.prepareStatement(QueryConstants.INSERT_QUERY_CUS);
		ps.setInt(1, cus.getCid());
		ps.setString(2, cus.getFname());
		ps.setString(3, cus.getLname());
		ps.setString(4,cus.getEmail());
		ps.setString(5, cus.getPassword());
		ps.setLong(6, cus.getMobileNumber());
		count=ps.executeUpdate();
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		try {
			ConnectionManager.closeConnection(con, ps);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return count;
	}

	@Override
	public List<Customer> viewAllCustomers() {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
	List<Customer> addCustomers=new ArrayList<Customer>();
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstants.SELECT__QUERY_CUS);
			rs= ps.executeQuery();
			while(rs.next())
			{int cid=rs.getInt(1);
			  String fname=rs.getString(2);
			  String lname=rs.getString(3);
			  String email=rs.getString(4);
			  String password=rs.getString(5);
			  long mobilenumber=rs.getLong(6);
			Customer cus=new Customer(cid,fname,lname,email,password,mobilenumber);
			addCustomers.add(cus);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				ConnectionManager.closeConnection(con, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return addCustomers;
	}

	@Override
	public Customer viewCustomer(int cid) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		Customer cus=null;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstants.SELECT_SPECIFIC_QUERY_CUS);
			ps.setInt(1, cid);
			rs=ps.executeQuery();
			if(rs.next())
			{int id=rs.getInt(1);
			  String fname=rs.getString(2);
			  String lname=rs.getString(3);
			  String email=rs.getString(4);
			  String password=rs.getString(5);
			  long mobilenumber=rs.getLong(6);
			cus=new Customer(id,fname,lname,email,password,mobilenumber);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{try {
			ConnectionManager.closeConnection(con, ps, rs);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		}
		
		return cus;
	}

	@Override
	public void updateCustomer(int cid) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		try {
			con=ConnectionManager.getConnection();
		System.out.println("What do you want to update 1)fname 2)lname 3)email 4)password 5)mobilenumber");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter Customer First Name");
			String fname=sc.next();
			ps=con.prepareStatement(QueryConstants.UPDATE_FNAME_QUERY_CUS);
			ps.setString(1, fname);
			ps.setInt(2, cid);
			count=ps.executeUpdate();
			if (count != 0) {
				System.out.println("Customer First Name updated Successfully");

			} else {
				System.out.println("Unable to update CustomerFirstName");
			}
			break;
		    
		case 2:
			System.out.println("Enter Customer Last Name");
			String lname=sc.next();
			ps=con.prepareStatement(QueryConstants.UPDATE_LNAME_QUERY_CUS);
			ps.setString(1, lname);
			ps.setInt(2, cid);
			count=ps.executeUpdate();
			if (count != 0) {
				System.out.println("Customer Last Name updated Successfully");

			} else {
				System.out.println("Unable to update CustomerLastName");
			}
			break;
		case 3:
			System.out.println("Enter Customer Email");
			String email=sc.next();
			ps=con.prepareStatement(QueryConstants.UPDATE_EMAIL_QUERY_CUS);
			ps.setString(1, email);
			ps.setInt(2, cid);
			count=ps.executeUpdate();
			if (count != 0) {
				System.out.println("Customer Email updated Successfully");

			} else {
				System.out.println("Unable to update CustomerEmail");
			}
			break;
		case 4:
			System.out.println("Enter Customer Password");
			String pwd=sc.next();
			ps=con.prepareStatement(QueryConstants.UPDATE__PASSWORD_QUERY_CUS);
			ps.setString(1, pwd);
			ps.setInt(2, cid);
			count=ps.executeUpdate();
			if (count != 0) {
				System.out.println("Customer Password updated Successfully");

			} else {
				System.out.println("Unable to update CustomerPassword");
			}
			break;
		case 5:
			System.out.println("Enter Customer MobileNo");
			int mobilenumber=sc.nextInt();
			ps=con.prepareStatement(QueryConstants.UPDATE_MOBILE_QUERY_CUS);
			ps.setLong(1, mobilenumber);
			ps.setInt(2, cid);
			count=ps.executeUpdate();
			if (count != 0) {
				System.out.println("Customer MobileNumber updated Successfully");

			} else {
				System.out.println("Unable to update CustomerMobileNumber");
			}
			
			break;
		default:System.out.println("Choose between 1 to 5");
		
		
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				ConnectionManager.closeConnection(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void deleteCustomer(int cid) {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstants.DELTE_QUERY_CUS);
			ps.setInt(1, cid);
			int count=ps.executeUpdate();
			if (count != 0) {
				System.out.println("Customer deleted Successfully");

			} else {
				System.out.println("Unable to delete Customer");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				ConnectionManager.closeConnection(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	@Override
	public void buyProduct() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); 
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		int totalprice=0;
		System.out.println("How many Products");
		int prd=sc.nextInt();
		 try {
			con=ConnectionManager.getConnection();
			for(int i=0;i<prd;i++) {
				System.out.println("Enter Product Id:");
			    int  pid=sc.nextInt();

			   
			  ps=con.prepareStatement(QueryConstants.SELECT_SPECIFIC_QUERY);
			  ps.setInt(1, pid);
			  rs=ps.executeQuery();
			  if(rs.next()) {
				 
				  int pqty=rs.getInt(3);
				  int pprice=rs.getInt(4);
				  
				 
					  totalprice+=pqty*pprice;
			  
				}
				System.out.println("totalprice:"+totalprice);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 finally
		 {
			 try {
				ConnectionManager.closeConnection(con, ps, rs);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		
		
	}

}
