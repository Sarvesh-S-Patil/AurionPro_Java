<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Customer List</title>

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
              <span class="fs-4">Edit Profile</span>
            </a>
            <div class="d-flex">
    				<a href="CustomerHome.jsp" class="btn btn-primary btn-lg ms-auto" tabindex="-1" role="button">
    				Go back</a>
			</div>
            	
		</header>
	</main>
    <div class="container mt-5">
    
        <form action="EditProfileController" method="post">
            <div class="mb-3">
                <label for="firstName" class="form-label">First Name</label>
                <input type="text" class="form-control" id="firstName" name="firstName" required>
            </div>
            <div class="mb-3">
                <label for="lastName" class="form-label">Last Name</label>
                <input type="text" class="form-control" id="lastName" name="lastName" required>
            </div>
            <div class="mb-3">
                <label for="password" class="form-label">Password</label>
                <input type="password" class="form-control" id="password" name="password" required>
            </div>
            <button type="submit" class="btn btn-primary">Update Profile</button>
        </form>

        <!-- Display status message -->
        <c:if test="${not empty updateStatus}">
            <div class="alert alert-info mt-3">
                ${updateStatus}
            </div>
        </c:if>
    </div>
    
    
        <div class="text-center mb-4">
            <script>
                window.addEventListener("load", function() {
                    var editProfileStatus = "<%= session.getAttribute("editProfileStatus") %>";
                    <% 
                        Long customerId = (Long) session.getAttribute("customerId");
                        String customerIdString = customerId != null ? customerId.toString() : "";
                    %>
                    if (editProfileStatus === "true") {
                        alert("Profile updated successfully, Customer ID is: " + "<%= customerIdString %>");
                    } else if (editProfileStatus === "false") {
                        alert("Profile update failed");
                    }
                });
            </script>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

</body>
</html>