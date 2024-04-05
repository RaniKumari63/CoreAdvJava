package com.product.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.product.model.UserService;

public interface UserDao {
	
public String checkLogin(String uname,String upwd);
public String registration(UserService user);
}
