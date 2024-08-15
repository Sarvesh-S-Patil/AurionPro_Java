<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <!-- Option 1: Include in HTML -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">

<title>Customer Home</title>
<style>
        .footer {
            position: fixed;
            bottom: 0;
            left: 0;
            width: 100%;
            text-align: center;
            padding: 10px;
            margin-bottom:10px;
            background-color: #f8f9fa; /* Optional: to match Bootstrap default */
        }
   </style>
</head>
<body >
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
    

  	  <main class="d-flex flex-nowrap h-100">
        <h1 class="visually-hidden">Customer Home</h1>
      
        <div class="container">
            <header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom navbar">
                <a href="" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
                    <svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"/></svg>
                    <span class="fs-4">Customer </span>
                </a>
        
                <ul class="nav nav-pills">
                    <li class="nav-item"><a href="" class="nav-link active" aria-current="page">Home</a></li>
                    <li class="nav-item"><a href="PassbookHome.jsp" class="nav-link">Passbook</a></li>
                    <li class="nav-item"><a href="AddTransaction.jsp" class="nav-link">New Transaction</a></li>
                    <li class="nav-item"><a href="EditProfileHome.jsp" class="nav-link">Edit Profile</a></li>
                    <li class="nav-item"><a href="LogoutController" class="nav-link text-danger">Logout</a></li>
                </ul>
            </header>
        </div>
    </main>

    <div class="container-fluid full-height">
        <div class="text-center display-1">
            Welcome to Customer Module
        </div>
    </div>

    <footer class="footer">
        <!-- Footer content here -->
    </footer>


    
    
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>