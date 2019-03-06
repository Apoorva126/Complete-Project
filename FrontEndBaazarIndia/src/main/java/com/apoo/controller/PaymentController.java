package com.apoo.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.apoo.dao.CartDAO;
import com.apoo.dao.ProductDAO;
import com.apoo.dao.UserDAO;
import com.apoo.model.CartItem;
import com.apoo.model.UserDetail;

@Controller
public class PaymentController 
{
	
	@Autowired
	CartDAO cartDAO;


	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	UserDAO userDAO;
	
@RequestMapping("/checkout")
public String checkout(Model m,HttpSession session)
{
	
	String username=(String)session.getAttribute("username");	    
    List<CartItem> cartItemList=cartDAO.listCartItem(username);
   
    m.addAttribute("cartItemList", cartItemList);
    m.addAttribute("grandTotal", this.getGrandTotal(cartItemList));
	UserDetail userDetail=userDAO.getUser(username);
   String address=userDAO.getUser(username).getCustomerAddr();
    m.addAttribute("addr", address);
    
	return "OrderConfirm";
}

@RequestMapping(value="/updateAddress",method=RequestMethod.POST)
public String updateAddress(@RequestParam("addr")String addr,Model m,HttpSession session )
{

	String username=(String)session.getAttribute("username");	    
    List<CartItem> cartItemList=cartDAO.listCartItem(username);
   
    m.addAttribute("cartItemList", cartItemList);
    m.addAttribute("grandTotal", this.getGrandTotal(cartItemList));
    
	UserDetail userDetail=userDAO.getUser(username);
	userDetail.setCustomerAddr(addr);
    userDAO.updateAddress(userDetail);

   String address=userDetail.getCustomerAddr();
   
    m.addAttribute("addr",address);
	
	return "OrderConfirm";
}


	
public int getGrandTotal(List<CartItem> cartList)
{
	 int grandTotal=0,count=0;
	 
	 
	 while(count<cartList.size())
	 {
		 grandTotal=grandTotal+(cartList.get(count).getQuantity()*cartList.get(count).getPrice());
		 count++;
	 }
	 
	 return grandTotal; 
}


}