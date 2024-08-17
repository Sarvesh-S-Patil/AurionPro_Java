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
import com.apro.model.Transaction;
import com.apro.model.TransactionUtil;

/**
 * Servlet implementation class ViewTransactionController
 */
@WebServlet("/ViewTransactionController")
public class ViewTransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewTransactionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(false);
		if (session == null || session.getAttribute("adminId")==null) { 
	        // No session found, forward to login page 
	        request.setAttribute("loginStatus", "false"); 
	        RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp"); 
	        dispatcher.forward(request, response); 
	        return; 
	    } 
        Connection connection = (Connection)session.getAttribute("connection"); 
        TransactionUtil transactionUtil= new TransactionUtil(connection);
        List<Transaction> transactions = transactionUtil.viewTransactions();
        System.out.println("Number of customers retrieved: " + (transactions != null ? transactions.size() : 0));
        // Set customers list as a request attribute
        request.setAttribute("transactions",transactions);
        
        // Forward to JSP page
        RequestDispatcher dispatcher = request.getRequestDispatcher("ViewTransaction.jsp");
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
