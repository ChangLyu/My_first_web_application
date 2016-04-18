package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Contacts;
import com.operation.Operation;

/**
 * Servlet implementation class EditManager
 */
@WebServlet("/EditManager")
public class EditManager extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditManager() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		editManage(request,response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		editManage(request,response);
	}
	protected void editManage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		Operation operation= new Operation();
		
		
		System.out.println("this is a edit method from editManager");
		System.out.println(request.getParameter("id"));
		int Id=Integer.parseInt(request.getParameter("id"));
        Contacts[] ct=new Contacts[1];
        ct[0]=operation.getContactById(Id);
        request.setAttribute("editContact", ct);
	    request.getRequestDispatcher("Edit_Contact.jsp").forward(request,response);
	   	
	}

}
