package com.zensar.daos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/*Author:Yashika Goyal
Creation Date:30 JULY 2019 3:32PM
Modified Date:30 july 2019 3:32PM
Version:1.0
Copyright:Zensar Technologies. All rights preserved.
Description: Represent data access object class .
which implement DAO interface.
it contain CRUD  operation method implementation .
for an entity product.
*/ 
import java.util.List;

import javax.xml.transform.Result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

@Repository
public class ProductdaoImpl implements ProductDao {
	@Autowired
	private JdbcTemplate jt;

	public void insert(Product product) {
		// TODO Auto-generated method stub
      String sql="insert into product values(?,?,?,?)";
      jt.update(sql,product.getProductId(),product.getName(),product.getBrand(),product.getPrice());
	  System.out.println("Product is inserted");
	}

	public void update(Product product) {
		// TODO Auto-generated method stub
     String sql="update product set name=?,brand=?,price=?" + "where id=?";
     jt.update(sql, product.getName(),product.getBrand(),product.getPrice(),product.getProductId());
	System.out.println("Product is updated");
	}

	public void delete(Product product) {
		// TODO Auto-generated method stub
      String sql="delete from product where id=?";
      jt.update(sql, product.getProductId());
      System.out.println("Product is deleted");
	}

	public Product getById(int productId) {
		// TODO Auto-generated method stub
		String sql="select id,name,brand,price from product"+" where id=?";
		Product dbProduct =jt.query(sql, new Object[] {productId},new ResultSetExtractor<Product>() {

			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if(rs.next())
			    {
				Product product=new Product();
				product.setProductId(rs.getInt(1));
				product.setName(rs.getString(2));
				product.setBrand(rs.getString(3));
				product.setPrice(rs.getFloat(4));
				return product;
			}
			else
			{
				return null;
				
			}	
			}
		});

		
		return dbProduct;
	}


	public List<Product> getAll() {
		// TODO Auto-generated method stub
		
		String sql="select * from product";
		List<Product> productList=jt.query(sql, new ResultSetExtractor<List<Product>>() {

			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<Product> plist=new ArrayList<Product>();
				 while(rs.next())
				 {
					 Product p=new 	Product();
					 p.setProductId(rs.getInt(1));
					 p.setName(rs.getString(2));
					 p.setBrand(rs.getString(3));
					 p.setPrice(rs.getFloat(4));
					 plist.add(p);
				 }
				
				return plist;
			}
		});
		
		return productList;
	}

}