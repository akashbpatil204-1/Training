<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%@ page import ="java.util.*"%>
<%@ page isErrorPage ="true"%>
<%@ page info  ="just for demo"%>
<%@ page session ="true"%>
<body>
<h1>Directives Demo</h1>
<hr>
<h2>
Today date:<%=new Date()%>
Exception : <%= exception %><br>
Information : <%= getServletInfo() %><br>
Session Id : <%= session.getId() %>

<hr>

<%@include file = "login.html" %>


</h2>
</body>
</html>