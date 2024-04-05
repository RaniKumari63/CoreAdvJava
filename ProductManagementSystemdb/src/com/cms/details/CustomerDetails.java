package com.cms.details;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.cms.dao.CustomerDAO;
import com.cms.dao.impl.CustomerDAOImpl;

import com.pms.config.ConnectionManager;
import com.pms.dao.ProductDAO;
import com.pms.dao.impl.ProductDAOImpl;
import com.pms.details.AdminDetails;
import com.pms.exception.CustomerException;
import com.pms.model.Product;
import com.pms.query.QueryConstants;

public class CustomerDetails {
	Scanner sc = new Scanner(System.in);
	ProductDAO daoimpl = new ProductDAOImpl();
	CustomerDAO cdaoimpl = new CustomerDAOImpl();
	AdminDetails ad = new AdminDetails();
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	ResultSet rs1 = null;
	ResultSet rs2 = null;
	String email = null;
	String password = null;

	public void customDetails() throws CustomerException {
		while (true) {
			System.out.format("%28s", "1)ViewProducts\n");
			System.out.format("%27s", "2)ViewProduct\n");
			System.out.format("%26s", "3)BuyProduct\n");
			System.out.format("%20s", "4)Back\n");
			System.out.println("Enter the choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Email Id ");
				email = sc.next();
				System.out.println("Enter Password");
				password = sc.next();
				try {
					con = ConnectionManager.getConnection();
					ps = con.prepareStatement(QueryConstants.SELECT_QUERY_USER_PWD);
					ps.setString(1, email);
					
					ResultSet rs = ps.executeQuery();

					if (rs.next()) {
						String pwd=rs.getString(5);
						if(password.equals(pwd))
						{
						List<Product> viewAllProducts=daoimpl.viewAllProducts();
						viewAllProducts.stream().forEach(pro->System.out.println(pro.getPid()+"\t"+pro.getPname()+"\t"+pro.getPqty()+"\t"+pro.getPprice()));
						
						}
						else
						{
							throw new CustomerException("Please enter valid password ");	
	
						}
					} else {
						                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
						throw new CustomerException("Please enter valid username ");	

					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				} finally {
    try { 
    	
		ConnectionManager.closeConnection(con, ps, rs);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
				}

				break;
			case 2:
				System.out.println("Enter Email ");
				email = sc.next();
				System.out.println("Enter Password");
				password = sc.next();
				try {
					con = ConnectionManager.getConnection();
					ps = con.prepareStatement(QueryConstants.SELECT_QUERY_USER_PWD);
					ps.setString(1, email);
				
					ResultSet rs1 = ps.executeQuery();
					if (rs1.next()) {
						String pwd=rs1.getString(5);
						if(password.equals(pwd))
						{
						System.out.println("Enter Product Id");

						Product pro=daoimpl.viewProduct(sc.nextInt());
						System.out.println(pro.getPid()+"\t"+pro.getPname()+"\t"+pro.getPqty()+"\t"+pro.getPprice());
						
						}
						else
						{
							throw new CustomerException("Please enter valid password ");
						}
					} else {
						throw new CustomerException("Please enter valid username ");
						
					}
						
						
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {
				    try {
						ConnectionManager.closeConnection(con, ps, rs);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
								}

				break;
			case 3:
				System.out.println("Enter Email ");
				email = sc.next();
				System.out.println("Enter Password");
				password = sc.next();
				try {
					con = ConnectionManager.getConnection();
					ps = con.prepareStatement(QueryConstants.SELECT_QUERY_USER_PWD);
					ps.setString(1, email);
					
					ResultSet rs2 = ps.executeQuery();
					if (rs2.next()) {
						String pwd=rs2.getString(5);
						if(password.equals(pwd))
						{
						cdaoimpl.buyProduct();
						}
						else
						{
							throw new CustomerException("Please enter valid password ");
						}
						
					} else {
						throw new CustomerException("Please enter valid username ");
						
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {
				    try {
						ConnectionManager.closeConnection(con, ps, rs);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
								}

				break;
			case 4:
				ad.menuDetails();
				break;
			default:
				System.out.println("Enter Choice between 1 to 4");

			}
		}
	}
}
