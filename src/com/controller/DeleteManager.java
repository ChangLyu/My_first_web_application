package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.operation.Operation;

/**
 * Servlet implementation class DeleteManager
 */
@WebServlet("/DeleteManager")
public class DeleteManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteManager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		deleteManage(request,response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		deleteManage(request,response);
	}
	
	protected void deleteManage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Operation operation= new Operation();
		System.out.println("this is a delete method from deleteManger");
		System.out.println(request.getParameter("id"));
		
		
		operation.delete(Integer.parseInt(request.getParameter("id")));
		
		@SuppressWarnings("rawtypes")
		List contactors=operation.getAllInf();
        request.setAttribute("contact", contactors);
        request.getRequestDispatcher("Show_Contacts.jsp").forward(request,response);

	
	}

}
