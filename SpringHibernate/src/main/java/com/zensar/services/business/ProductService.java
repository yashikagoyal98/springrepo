package com.zensar.services.business;

import java.util.List;
import com.zensar.entities.Product;

/*Author:Yashika Goyal
Creation Date:30 JULY 2019 4:52PM
Modified Date:30 july 2019 4:52PM
Version:1.0
Copyright:Zensar Technologies. All rights preserved.
Description: Represent product services which can be accessed in presentation layer.
it encapsulates business logic of product entity.
*/ 
public interface ProductService {
 

	void create(Product product);
	void edit(Product product);
	void remove(Product product);
	Product findproductById(int productId);
	List<Product> findAllProducts();
	
	
	
}
