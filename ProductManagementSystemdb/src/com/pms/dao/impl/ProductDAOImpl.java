package com.pms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.pms.config.ConnectionManager;
import com.pms.dao.ProductDAO;
import com.pms.model.Product;
import com.pms.query.QueryConstants;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public int addProducts(Product pro) {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement ps = null;
		int count = 0;
		try {
			con = ConnectionManager.getConnection();
			ps = con.prepareStatement(QueryConstants.INSERT_QUERY);
			ps.setInt(1, pro.getPid());
			ps.setString(2, pro.getPname());
			ps.setInt(3, pro.getPqty());
			ps.setInt(4, pro.getPprice());
			count = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
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
	public List<Product> viewAllProducts() {
		// TODO Auto-generated method stub

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		List<Product> addProducts = new ArrayList<Product>();
		try {
			con = ConnectionManager.getConnection();
			ps=con.prepareStatement(QueryConstants.SELECT_QUERY);
			rs = ps.executeQuery();
			while (rs.next()) {
				int pid = rs.getInt(1);
				String pname = rs.getString(2);
				int pqty = rs.getInt(3);
				int pprice = rs.getInt(4);
				Product product = new Product(pid, pname, pqty, pprice);
				addProducts.add(product);
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
		return addProducts;
	}

	@Override
	public Product viewProduct(int pid) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Product product = null;
		try {
			con = ConnectionManager.getConnection();
			ps = con.prepareStatement(QueryConstants.SELECT_SPECIFIC_QUERY);
			ps.setInt(1, pid);
			rs = ps.executeQuery();
			if (rs.next()) {
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int qty = rs.getInt(3);
				int price = rs.getInt(4);
				product = new Product(pid, name, qty, price);

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

		return product;
	}

	@Override
	public void updateProduct(int pid) {
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps = null;
		int count = 0;
		try {
			con = ConnectionManager.getConnection();
			System.out.println("What do you want to update 1)pname 2)pqty 3)price");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				count = 0;
				System.out.println("Enter product name");
				String pname = sc.next();

				ps=con.prepareStatement(QueryConstants.UPDATE_PNAME_QUERY);
				ps.setString(1, pname);
				ps.setInt(2, pid);
				count = ps.executeUpdate();
				if (count != 0) {
					System.out.println("Product Name updated Successfully");

				} else {
					System.out.println("Unable to update ProductName");
				}
				break;

			case 2:
				count = 0;
				System.out.println("Enter product quantity");
				int pqty = sc.nextInt();
				ps=con.prepareStatement(QueryConstants.UPDATE_PQTY_QUERY);
				ps.setInt(1, pqty);
				ps.setInt(2, pid);
				count = ps.executeUpdate();
				if (count != 0) {
					System.out.println("Product Quantity updated Successfully");

				} else {
					System.out.println("Unable to update ProductQuantity");
				}
				break;
			case 3:
				count = 0;
				System.out.print("Enter product price");
				int pprice = sc.nextInt();
				ps=con.prepareStatement(QueryConstants.UPDATE_PPRICE_QUERY);
				ps.setInt(1, pprice);
				ps.setInt(2, pid);
				count = ps.executeUpdate();
				if (count != 0) {
					System.out.println("Product Price updated Successfully");

				} else {
					System.out.println("Unable to update ProductPrice");
				}
				break;
			default:
				System.out.println("Choose between 1 to 3 ");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ConnectionManager.closeConnection(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = ConnectionManager.getConnection();
			ps = con.prepareStatement(QueryConstants.DELETE_QUERY);
			ps.setInt(1, pid);
			int count = ps.executeUpdate();
			if (count != 0) {
				System.out.println("Products deleted Successfully");

			} else {
				System.out.println("Unable to delete Product");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ConnectionManager.closeConnection(con, ps);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
