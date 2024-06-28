package com.tka.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tka.entity.User;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
	
	// all data coming from browser will be present inside HttpServletRequest object
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// all data coming from browser will be present inside HttpServletRequest object
		
		
			// can we give HttpServletRequest object to hibernate's save() method ?

			String username=request.getParameter("username");
			
			String password=request.getParameter("password");

			long mobno= Long.parseLong(request.getParameter("mobno")) ;

			String emailid=request.getParameter("emailid");

			
			System.out.println(username + " " + password + " " + mobno + " " + emailid);
			
			
			User user=new User();
			
			user.setUsername(username);
			user.setPassword(password);
			user.setMobno(mobno);
			user.setEmailid(emailid);
				
			
			Session session=new Configuration().configure().addAnnotatedClass(User.class).buildSessionFactory().openSession();
			
			Transaction tx=session.beginTransaction();
			
				session.save(user);
				
			tx.commit();
			
			
			response.sendRedirect("login.jsp");
			
		}

	

	}


