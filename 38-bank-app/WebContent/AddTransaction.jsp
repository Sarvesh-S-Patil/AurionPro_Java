<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Add Transaction</title>
    <style>
        .card { margin-top: 20px; }
    </style>
</head>
<body>
	<% 
    session = request.getSession(); 
 
    if (session == null) { 
        // No session found, forward to login page 
        request.setAttribute("loginStatus", "false"); 
        RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp"); 
        dispatcher.forward(request, response); 
        return; 
    } 
	%>
    <div class="container">
        <header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
            <a href="" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
                <span class="fs-4">Add Transaction</span>
            </a>
            <div class="d-flex">
                <a href="CustomerHome.jsp" class="btn btn-primary btn-lg ms-auto" tabindex="-1" role="button">Go back</a>
            </div>
        </header>

        <div class="card">
            <div class="card-body">
                <h5 class="card-title">Enter Transaction Details</h5>
                <form action="AddTransactionController" method="post">
                    <div class="mb-3">
                        <label for="senderAccountId" class="form-label">Sender Account ID</label>
                        <input type="number" id="senderAccountId" name="senderAccountId" class="form-control" >
                        <div class="form-text">Leave empty if not applicable (for  Debit transactions).</div>
                    </div>
                    <div class="mb-3">
                        <label for="receiverAccountId" class="form-label">Receiver Account ID</label>
                        <input type="number" id="receiverAccountId" name="receiverAccountId" class="form-control">
                        <div class="form-text">Leave empty if not applicable ( for Credit  transactions).</div>
                    </div>
                    <div class="mb-3">
                        <label for="transactionType" class="form-label">Transaction Type</label>
                        <select id="transactionType" name="transactionType" class="form-select" required>
                            <option value="Credit">Credit</option>
                            <option value="Debit">Debit</option>
                            <option value="Transfer">Transfer</option>
                        </select>
                    </div>
                    <div class="mb-3">
                        <label for="amount" class="form-label">Amount</label>
                        <input type="number" id="amount" name="amount" step="0.01" class="form-control" required>
                    </div>
                    <button type="submit" class="btn btn-primary">Submit</button>
                </form>
            </div>
        </div>

        <div class="text-center mb-4">
            <script>
                window.addEventListener("load", function() {
                    var transactionStatus = "<%= session.getAttribute("transactionStatus") %>";
                    if (transactionStatus === "true") {
                        alert("Transaction Successful");
                    } else if (transactionStatus === "false") {
                        alert("Transaction Failed");
                    }
                    // Clear the session attribute
                    <% session.removeAttribute("transactionStatus"); %>
                });
            </script>
        </div>

    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>
