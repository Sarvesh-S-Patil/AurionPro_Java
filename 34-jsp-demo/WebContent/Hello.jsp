<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<b>
		This is JSP demo
	</b>
		<%
		  Date date = new Date();
		  out.print(date);
		%>
	<b>
		<%= new Date() %>
	</b>
	
	<%@ include file="Contents.jsp" %>
	<h1>
		<%! String message = "Welcome"; %>
	</h1>

	<%
		int number1 = Integer.parseInt(request.getParameter("number1"));
		int number2 = Integer.parseInt(request.getParameter("number1"));
		out.print(number1+number2);
	%>

	

</body>
</html>