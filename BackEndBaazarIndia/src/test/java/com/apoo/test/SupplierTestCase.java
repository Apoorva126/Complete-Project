package com.apoo.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apoo.dao.SupplierDAO;

import com.apoo.model.Supplier;

public class SupplierTestCase {

	static SupplierDAO supplierDAO;
	@BeforeClass
    public static void executeFirst()
    {
  AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
	    context.scan("com.apoo");
	    context.refresh();  		
	    supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
  	  
    }

@Test
public void addSupplierTest()
{
	Supplier supplier=new Supplier();
	supplier.setSupplierName("XYZ Electronics");
	supplier.setSupplierAddr("Navyug Market");
	assertTrue("Problem in adding Supplier",supplierDAO.addSupplier(supplier));
	
	}

}
