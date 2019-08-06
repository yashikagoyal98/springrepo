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
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

/*Author:Yashika Goyal
Creation Date:30 JULY 2019 10:40PM
Modified Date:31 july 2019 10:40PM
Version:2.0
Copyright:Zensar Technologies. All rights preserved.
Description: Represent product services which can be accessed in presentation layer.
it encapsulates business logic of product entity.
*/ 

@Repository
public class ProductdaoImpl implements ProductDao {
@Autowired
	private HibernateTemplate ht;
	
	public void insert(Product product) {
		// TODO Auto-generated method stub
		ht.save(product);
	}

	public void update(Product product) {
		// TODO Auto-generated method stub
		ht.update(product);
	}

	public void delete(Product product) {
		// TODO Auto-generated method stub
		ht.delete(product);
	}

	public Product getById(int productId) {
		// TODO Auto-generated method stub
		
		return ht.get(Product.class, productId);
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return ht.loadAll(Product.class);
	}
	
}
