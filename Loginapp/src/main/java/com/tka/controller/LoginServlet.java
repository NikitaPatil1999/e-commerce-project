package com.tka.controller;





import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.LoginService;
//any class which extends HttpServlet class is a servlet class
//controller class controls which web page will be shown to user

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");

		String password=request.getParameter("password");
	
		LoginService service=new LoginService();
		
		boolean answer=service.validate(username, password);

		if(answer)
		{
			response.sendRedirect("welcome.jsp");
		}
		
		else
		{
			response.sendRedirect("login.jsp");
		}
		
	}

}
