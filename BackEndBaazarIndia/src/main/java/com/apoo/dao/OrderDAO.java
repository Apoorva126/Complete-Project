package com.apoo.dao;

import com.apoo.model.OrderDetail;

public interface OrderDAO {
	
	    public boolean saveOrder(OrderDetail orderDetail);
		public boolean updateCart(String username);
	
}
