package com.pms.query;

public interface QueryConstants {
String INSERT_QUERY="insert into product values(?,?,?,?)";
String SELECT_QUERY="select * from product";
String SELECT_SPECIFIC_QUERY="select * from  product  where pid=?";
String UPDATE_PNAME_QUERY="update product set pname=? where pid=?";
String UPDATE_PQTY_QUERY="update product set pqty=? where pid=?";
String UPDATE_PPRICE_QUERY="update product set pprice=? where pid=?";
String DELETE_QUERY="delete from product where pid=?";
String INSERT_QUERY_CUS="insert into customer values(?,?,?,?,?,?)";
String SELECT__QUERY_CUS="select * from customer";
String SELECT_SPECIFIC_QUERY_CUS="select * from customer where cid=?";
String UPDATE_FNAME_QUERY_CUS="update customer set fname=? where cid=?";
String UPDATE_LNAME_QUERY_CUS="update customer set lname=? where cid=?";
String UPDATE_EMAIL_QUERY_CUS="update customer set email=? where cid=?";
String UPDATE__PASSWORD_QUERY_CUS="update customer set password=? where cid=?";
String UPDATE_MOBILE_QUERY_CUS="update customer set mobilenumber=? where cid=?";
String DELTE_QUERY_CUS="delete  from customer where cid=?";
String SELECT_QUERY_USER_PWD="select * from customer where email=?";

}
