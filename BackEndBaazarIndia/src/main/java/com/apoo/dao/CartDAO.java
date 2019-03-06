package com.apoo.dao;

import java.util.List;

import com.apoo.model.CartItem;
import com.apoo.model.Category;

public interface CartDAO {

    boolean addCartItem(CartItem cartitem);
	public boolean deleteCartItem(CartItem cartitem);
	public boolean updateCartItem(CartItem cartitem);
	public CartItem getCartItem(int cartItemId);
	public List<CartItem> listCartItem(String username);
	
	
}
