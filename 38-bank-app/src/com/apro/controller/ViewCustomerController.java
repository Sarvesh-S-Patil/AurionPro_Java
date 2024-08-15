package com.apro.controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.apro.model.Customer;
import com.apro.model.CustomerUtil;
import com.mysql.cj.Session;

/**
 * Servlet implementation class ViewCustomerController
 */
@WebServlet("/ViewCustomerController")
public class ViewCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCustomerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
        Connection connection = (Connection)session.getAttribute("connection"); 
        CustomerUtil customerUtil = new CustomerUtil(connection);
        List<Customer> customers = customerUtil.getCustomers();
        System.out.println("Number of customers retrieved: " + (customers != null ? customers.size() : 0));
        // Set customers list as a request attribute
        request.setAttribute("customers", customers);
        
        // Forward to JSP page
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewCustomer.jsp");
        dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
