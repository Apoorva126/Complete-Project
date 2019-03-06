package com.apoo.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.apoo.dao.OrderDAO;
import com.apoo.model.OrderDetail;

public class OrderTestCase {
static OrderDAO orderDAO;
	
	@BeforeClass
	public static void executeFirst()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.apoo");
		context.refresh();	
		orderDAO=(OrderDAO)context.getBean("orderDAO");
	}
	
	@Test
	public void saveOrderTest()
	{
		OrderDetail orderDetail=new OrderDetail();
		
		orderDetail.setOrderDate(new java.util.Date());
		orderDetail.setCartId(101);
		orderDetail.setShippingAddr("Nehru Nagar");
		orderDetail.setTotalAmount(16000);
		orderDetail.setTranType("COD");
		orderDetail.setUsername("abhishek");
		
		assertTrue("problem in Saving Order",orderDAO.saveOrder(orderDetail));
	}
	@Test
	public void updateCart()
	{
		assertTrue("problem in Updating Cart",orderDAO.updateCart("abhishek"));
		
	}
	
}