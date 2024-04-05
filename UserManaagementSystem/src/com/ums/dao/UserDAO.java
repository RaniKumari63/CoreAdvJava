package com.ums.dao;

public interface UserDAO {
void register();
boolean verifyUnAndPw(String email,String pass);
String forgotPassword(String email);

}
