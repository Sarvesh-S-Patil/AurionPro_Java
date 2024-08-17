<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <!-- Option 1: Include in HTML -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
<title>Add Customer</title>
</head>
<body>
	<% 
    session = request.getSession(false); 
 
    if (session == null || session.getAttribute("adminId")==null) { 
        // No session found, forward to login page 
        request.setAttribute("loginStatus", "false"); 
        RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp"); 
        dispatcher.forward(request, response); 
        return; 
    } 
	%>
	
	<% 
	    String addCustomerStatus = (String) request.getAttribute("addCustomerStatus");
	%>
	
	<div class="text-center mb-4">
	    <script>
	        window.addEventListener("load", function() {
	            <% if ("true".equals(addCustomerStatus)) { %>
	                alert("Account Created Successfully");
	            <% } else if ("false".equals(addCustomerStatus)) { %>
	                alert("Account Creation Failed");
	            <% } %>
	        });
	    </script>
	</div>
	<main>
		<div class="container">
          <header class="d-flex flex-wrap justify-content-center py-3 mb-4 border-bottom">
            <a href="" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-dark text-decoration-none">
              <svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"/></svg>
              <span class="fs-4">Add Customer</span>
            </a>
            <div class="d-flex">
    				<a href="AdminHome.jsp" class="btn btn-primary btn-lg ms-auto" tabindex="-1" role="button">Go back</a>
			</div>
            	
	</main>
	<section class="vh-100 gradient-custom">
        <div class="container py-5 h-100">
          <div class="row justify-content-center align-items-center h-100">
            <div class="col-12 col-lg-9 col-xl-7">
              <div class="card shadow-2-strong card-registration" style="border-radius: 15px;">
                <div class="card-body p-4 p-md-5">
                  <h3 class="mb-4 pb-2 pb-md-0 mb-md-5">Registration Form</h3>
                  <form action="AddCustomerController" method="post">
      
                    <div class="row">
                      <div class="col-md-6 mb-4">
      
                        <div data-mdb-input-init class="form-outline">
                          <input type="text" id="firstName" name="firstName" class="form-control form-control-lg"  />
                          <label class="form-label" for="firstName">First Name</label>
                        </div>
      
                      </div>
                      <div class="col-md-6 mb-4">
      
                        <div data-mdb-input-init class="form-outline">
                          <input type="text" id="lastName" name="lastName" class="form-control form-control-lg" />
                          <label class="form-label" for="lastName">Last Name</label>
                        </div>
      
                      </div>
                    </div>

                    <div class="row">
                        <div class="col-md-6 mb-4">
        
                          <div data-mdb-input-init class="form-outline">
                            <input type="email" id="email" name="email"  class="form-control form-control-lg" />
                            <label class="form-label" for="email">Email</label>
                          </div>
        
                        </div>
                        <div class="col-md-6 mb-4">
        
                          <div data-mdb-input-init class="form-outline">
                            <input type="password" id="password" name="password" class="form-control form-control-lg" />
                            <label class="form-label" for="password">Password</label>
                          </div>
        
                        </div>
                      </div>
      
                    <div class="mt-4 pt-2">
                      <input data-mdb-ripple-init class="btn btn-primary btn-lg" type="submit" value="Submit" />
                    </div>
      
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>
      </section>
	
	
	 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>