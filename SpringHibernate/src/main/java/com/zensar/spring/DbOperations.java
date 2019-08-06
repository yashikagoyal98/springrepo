package com.zensar.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.business.ProductService;

/**
 * Hello world!
 *
 */
public class DbOperations {
	public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("dbconfig.xml");
    	ProductService service=ctx.getBean("productServiceImpl",ProductService.class);
    	Product product=new Product(1006, "Laptop", "Asus", 50000.00f);
		
		/* for creating 
         * service.create(product);
		 */                                         
		
    	
    	/* for finding product by id
		 * product=service.findproductById(1001); 
		 * System.out.println(product);
		 */
		 
		
		  /* for editing or updating
		 * Product product1=new Product(1004,"Laptop", "Dell", 76000.00f);
		 * service.edit(product1);
		 */
		  
		
		  /* for removing
		 * Product product2= new Product(); product2.setProductId(6007);
		 * service.remove(product2);
		 */
		 
		 
	
		
		/* for displaying product
		 * List<Product> productList=service.findAllProducts(); 
		 * for(Product p:productList) System.out.println(p);
		 */
		 	 
		
		  
		  /* find product by id
		 * Product product=service.findproductById(1001);
		 * System.out.println(product);
		 */
		
}
}
