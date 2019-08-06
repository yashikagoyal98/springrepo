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
public class DbOperations 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctx=new ClassPathXmlApplicationContext("dbconfig.xml");
		/* Product product=new Product(1002, "Laptop", "Dell", 70000.00f); */
    	ProductService service=ctx.getBean("productServiceImpl",ProductService.class);
		/* service.create(product); */ //  for creating
		/* Product product1=new Product(1004, "Laptop", "Lenovo", 50000.00f); */
		/* product=service.findproductById(1001); */
		/* service.edit(product1); */ // for editing or updating 
		/* Product product2= new Product(); */
		/* product2.setProductId(1001); */
		/* service.remove(product2); */
		 
		/*
		 * List<Product> productList=service.findAllProducts(); //for displaying product 
		 * for(Product p:productList) System.out.println(p);
		 */	 
	   Product product=service.findproductById(1001);//find product by id
	   System.out.println(product);
	   
		
}
}
