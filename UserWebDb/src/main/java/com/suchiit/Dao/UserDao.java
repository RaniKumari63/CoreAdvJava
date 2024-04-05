package com.suchiit.Dao;

import com.suchiit.model.User;

public interface UserDao {

	public boolean register(User user);
	String getPassword(String email);
	boolean validEmailAndPassWord(String email,String password);
}
