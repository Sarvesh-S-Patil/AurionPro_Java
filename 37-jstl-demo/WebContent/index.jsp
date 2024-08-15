<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome</h1>
	
	<c:import url="Home.jsp"></c:import>
	
	<c:out value="This is example of out"></c:out>
	
	<c:set var="name" value="John"/> 
      My Name is   
    <c:out value="${name}"/> 
    
    <c:if test="${{1000>500}">
		<p>The name is john</p>    	
    </c:if>

</body>
</html>