package com.apro.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.apro.model.TransactionUtil;

/**
 * Servlet implementation class AddTransactionController
 */
@WebServlet("/AddTransactionController")
public class AddTransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddTransactionController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("customerId")==null) { 
            // No session found, forward to login page 
            request.setAttribute("loginStatus", "false"); 
            RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp"); 
            dispatcher.forward(request, response); 
            return; 
        } 
        Connection connection = (Connection) session.getAttribute("connection");
        long senderAccountId = request.getParameter("senderAccountId").isEmpty() ? -1 : Long.parseLong(request.getParameter("senderAccountId"));
        long receiverAccountId = request.getParameter("receiverAccountId").isEmpty() ? -1 : Long.parseLong(request.getParameter("receiverAccountId"));
        String transactionType = request.getParameter("transactionType");
        double amount = Double.parseDouble(request.getParameter("amount"));

        TransactionUtil transactionUtil = new TransactionUtil(connection);
        boolean success = transactionUtil.addTransaction(senderAccountId, receiverAccountId, transactionType, amount);

        

        session.setAttribute("transactionStatus", success ? "true" : "false");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("AddTransaction.jsp");
        requestDispatcher.forward(request, response);
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
