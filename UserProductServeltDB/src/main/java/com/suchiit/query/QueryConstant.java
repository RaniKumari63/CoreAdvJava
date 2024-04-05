package com.suchiit.query;

public interface QueryConstant {
 String SELECT_U_PWD="select * from user where email=? and pwd=?";
String INSERT_USER="insert into user values (?,?,?,?,?,?)";
String SELECT_PWD="select pwd from user where email=?";
}
