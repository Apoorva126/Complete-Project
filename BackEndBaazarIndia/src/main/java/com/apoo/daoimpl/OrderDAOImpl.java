package com.apoo.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.apoo.dao.OrderDAO;
import com.apoo.model.OrderDetail;

@Repository("orderDAO")
@Transactional
public class OrderDAOImpl implements OrderDAO {

	@Autowired
	SessionFactory sessionFactory;
	
	

	public boolean saveOrder(OrderDetail orderDetail) 
	{
		try
		{
			sessionFactory.getCurrentSession().save(orderDetail);
		return true;
		}
		
		catch(Exception e)
		{
		 return false;	
			
		}
	}



	
	public boolean updateCart(String username) {
		
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("update CartItem set Paymentstatus='P' where username=:uname");
		query.setParameter("uname", username);
		int row_eff=query.executeUpdate();
		if(row_eff>0)
			return true;
		else
		return false; 
	}




	
	}

