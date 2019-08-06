package com.zensar.daos;

/*Author:Yashika Goyal
Creation Date:30 JULY 2019 3:13PM
Modified Date:30 july 2019 3:13M
Version:1.0
Copyright:Zensar Technologies. All rights preserved.
Description: Represent data access objects Interface.
used by business layer.
it contains CRUD operation method for entity product.
*/ 

import java.util.List;

import com.zensar.entities.Product;

public interface ProductDao {

	void insert(Product product);
	void update(Product product);
	void delete(Product product);
	Product getById(int productId);
	List<Product> getAll();
	
}
