

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- Option 1: Include in HTML -->

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<i class="bi bi-bank2"></i>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
<title>Home</title>
</head>
<body>
	  <style>
    .bd-placeholder-img {
      font-size: 1.125rem;
      text-anchor: middle;
      -webkit-user-select: none;
      -moz-user-select: none;
      user-select: none;
    }

    @media (min-width: 768px) {
      .bd-placeholder-img-lg {
        font-size: 3.5rem;
      }
    }
  </style>

  
  <!-- Custom styles for this template -->
  <link href="css/signin.css" rel="stylesheet">
</head>

<body class="text-center">


	<% 
	    String loginStatus = (String) request.getAttribute("loginStatus");
	%>
	
	<div class="text-center mb-4">
	    <script>
	        window.addEventListener("load", function() {
	            <% if ("false".equals(loginStatus)) { %>
	                alert("Login Failed");
	            <% } %>
	        });
	    </script>
	</div>
  	
      <main class="form-signin">
      <form action="HomeController" method="post">
        <img class="mb-4" src="assets/Bank Logo.jpg" alt="Bank Logo" width="200" height="200">
        <h1 class="h3 mb-3 fw-normal">Sign in as : </h1>
        
		<select class="form-select mb-3" aria-label="Login Type" name="login-type">
		  <option selected value="customer">Customer</option>
		  <option value="admin">Admin</option>
		</select>

        <div class="form-floating">
          <input type="email" class="form-control" id="floatingInput" placeholder="name@exail.com" name="username">
          <label for="floatingInput">Email address</label>
        </div>
        <div class="form-floating">
          <input type="password" class="form-control" id="floatingPassword" placeholder="Password" name="password">
          <label for="floatingPassword">Password</label>
        </div>

        <button class="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>
     
      </form>
      </main>

	
	
	
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>