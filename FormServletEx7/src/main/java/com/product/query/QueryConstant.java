package com.product.query;

public interface QueryConstant {
String SELECT_UNAME_PWD_QUERY="select * from reg_user where uname=? and upwd=?";
String SELECT_UNAME_QUERY="select * from reg_user where uname=?";
String INSERT_QUERY="insert into reg_user values(?,?,?,?)";
}
