package com.suchiit.query;

public interface QueryConstant {
	
String INSERT_STU="insert into student values(?,?,?)";
String SELECT_QUERY="select * from student";
String SELECT_SPECIFIC_QUERY="select * from student where sno=?";
String UPDATE_QUERY="update student set sname=?,saddr=? where sno=?";
String DELETE_QUERY="delete from student where sno=? ";
}
