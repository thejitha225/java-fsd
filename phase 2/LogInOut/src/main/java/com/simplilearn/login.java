package com.simplilearn;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  	
	        
	        String email = request.getParameter("username");
	        String pass = request.getParameter("userpass");
	        RequestDispatcher rd=null;
	        
	        if(email.equals("abc")&& pass.equals("123"))
	        {
	        	rd=request.getRequestDispatcher("dashboard");

	    		rd.forward(request, response);
	    		  
	        }
	        else
	        {
	        	rd=request.getRequestDispatcher("index.html");
	        	PrintWriter out = response.getWriter();
	        	rd.include(request, response);
	        	out.println("Invalid Credential");
	        }
	           
		
	}

	

}
