package com.apoo.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apoo.dao.ProductDAO;
import com.apoo.model.Product;

public class ProductTestCase {
	@Autowired
	static ProductDAO productDAO;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	    
	    context.scan("com.apoo");
	    context.refresh();
	  productDAO=(ProductDAO)context.getBean("productDAO");
	  
	}
	
	
	@Test
	public void addProductTest() {
		Product product=new Product();
		
		product.setProductName("Samsung j6 Max");
		product.setProductDesc("SmartPhone");
		product.setPrice(16000);
		product.setStock(10);
		product.setCategoryId(38);
		product.setSupplierId(2);
		assertTrue("Problem in adding the product",productDAO.addProduct(product));
	}
	/*
	@Test
	public void deleteProductTest()
	{
		Product product=productDao.getProduct(10);
		
		assertTrue("Problem in deleting product",productDao.deleteProduct(product));
	}
	
	@Test
	public void updateProductTest()
	{
		Product product=productDao.getProduct(70);
		product.setProductDesc("Western Wear");
		
		assertTrue("Problem in updating product",productDao.updateProduct(product));
	}
	*/
}

