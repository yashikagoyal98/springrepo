package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/*Author:Yashika Goyal
Creation Date:30 JULY 2019 3:08PM
Modified Date:31 july 2019 10:56AM
Version:2.0
Copyright:Zensar Technologies. All rights preserved.
Description:It is a persistence class in hibernate. 
*/ 

@Component
@Entity
@Table(name="product")
public class Product {
	@Id
	@Column(name="id")
	private int productId;
	private String name;
	private String brand;
	private float price;

	public Product()
	{
		
	}

@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}

public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

public Product(int productId, String name, String brand, float price) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}


}