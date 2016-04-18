package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import com.model.Contacts;
import com.operation.Operation;

/**
 * Servlet implementation class Contact_Servlet
 */
//@WebServlet("/Contact_Servlet")
public class Contact_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contact_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("from request");
		//doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("this is from post method");
		
		Operation operation= new Operation();
		
		String str=request.getParameter("operation");
		if(str==null){
			
		}else if(str.equals("show_contacts")){
			
			@SuppressWarnings("rawtypes")
			List contact=operation.getAllInf();
	        request.setAttribute("contact", contact);
	        request.getRequestDispatcher("Show_Contacts.jsp").forward(request,response);
			
		}else if(str.equals("add")){
			System.out.println("this is add method");
			operation.add(Integer.parseInt(request.getParameter("Id")),request.getParameter("Name"), request.getParameter("Phone_Number"), request.getParameter("E_mail"));
			
			@SuppressWarnings("rawtypes")
			List contact=operation.getAllInf();
	        request.setAttribute("contact", contact);
	        request.getRequestDispatcher("Show_Contacts.jsp").forward(request,response);

		}else if(str.equals("edit")){
			
		   operation.edit(Integer.parseInt(request.getParameter("Id")),request.getParameter("Name"), request.getParameter("Phone_Number"), request.getParameter("E_mail"));
			@SuppressWarnings("rawtypes")
			List contact=operation.getAllInf();
	        request.setAttribute("contact", contact);
	        request.getRequestDispatcher("Show_Contacts.jsp").forward(request,response);

		}
		
        
        
	
		//sessionFactory.close();
	
	}

}
