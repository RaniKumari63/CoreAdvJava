package com.product.query;

public interface QueryConstants {
	String INSERT_QUERY="insert into product (pname,pqty,pprice) values(?,?,?)";
	String SELECT_QUERY="select * from product";
	String DELETE_QUERY="delete from product where pid=?";
	String SELECT_SPECIFIC_QUERY="select * from product where pid=?";
	String UPDATE_QUERY="update product set pname=?,pqty=?,pprice=? where pid=?";
}
