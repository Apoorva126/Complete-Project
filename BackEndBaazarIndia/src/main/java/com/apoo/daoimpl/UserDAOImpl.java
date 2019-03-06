package com.apoo.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.apoo.dao.UserDAO;
import com.apoo.model.Category;
import com.apoo.model.UserDetail;

@Repository("userDAO")
@Transactional

public class UserDAOImpl implements UserDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	
	public boolean registerUser(UserDetail user) {
		try
		{
			sessionFactory.getCurrentSession().save(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public boolean updateAddress(UserDetail user) {
		try
		{
			sessionFactory.getCurrentSession().update(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}


	public UserDetail getUser(String username) {
		Session session=sessionFactory.openSession();
		UserDetail user=session.get(UserDetail.class, username);
		
		return user;
	}
	

}
