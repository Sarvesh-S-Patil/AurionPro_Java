<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.apro.model.Account" %>
<%@ page import="com.apro.model.Transaction" %>
<%@ page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>View Passbook</title>
</head>
<body>
<% 
    session = request.getSession(false); 
 
    if (session == null || session.getAttribute("customerId")==null) { 
        // No session found, forward to login page 
        request.setAttribute("loginStatus", "false"); 
        RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp"); 
        dispatcher.forward(request, response); 
        return; 
    } 
	%>
    <main>
        <div class="container">
            <header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
                <a href="" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
                    <svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"/></svg>
                    <span class="fs-4">View Passbook</span>
                </a>
                <div class="d-flex">
                    <a href="CustomerHome.jsp" class="btn btn-primary btn-lg ms-auto" tabindex="-1" role="button">
                        Go back
                    </a>
                </div>
            </header>
        </div>
    </main>

    <div class="container mt-5">
        <h2 class="mb-4">Accounts</h2>
        <table class="table table-striped">
            <thead>
                <tr>
                    <th scope="col">Account ID</th>
                    <th scope="col">Balance</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="account" items="${accounts}">
                    <tr>
                        <td>${account.accountId}</td>
                        <td>${account.balance}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <div class="container mt-5">
        <h2 class="mb-4">View Transactions</h2>
        <form action="ViewPassbookController" method="get">
            <div class="mb-3">
                <label for="accountId" class="form-label">Enter Account ID:</label>
                <input type="number" id="accountId" name="accountId" class="form-control" required />
            </div>
            <button type="submit" class="btn btn-primary">View Transactions</button>
        </form>

        <c:if test="${not empty transactions}">
            <h3 class="mt-4">Transactions for Account ID ${param.accountId}</h3>
            <table class="table table-striped mt-3">
                <thead>
                    <tr>
                        <th scope="col">Transaction ID</th>
                        <th scope="col">Sender Account ID</th>
                        <th scope="col">Receiver Account ID</th>
                        <th scope="col">Transaction Type</th>
                        <th scope="col">Amount</th>
                        <th scope="col">Date</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="transaction" items="${transactions}">
                        <tr>
                            <td>${transaction.transactionId}</td>
                            <td>${transaction.senderAccountId}</td>
                            <td>${transaction.recieverAccountId}</td>
                            <td>${transaction.transactionType}</td>
                            <td>${transaction.amount}</td>
                            <td>${transaction.date}</td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </c:if>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
