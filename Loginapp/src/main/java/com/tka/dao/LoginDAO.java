package com.tka.dao;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import com.tka.entity.User;
public class LoginDAO {
	public String getDataBasePassword(String username)
	{
		Session session=new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory().openSession();
		
		User userFromDB=session.get(User.class,username);
		
		// userFromDB==>[ username=x password=y mobno=123 getPassword()] User class object given by get()
		
		return userFromDB.getPassword();
	}

}
