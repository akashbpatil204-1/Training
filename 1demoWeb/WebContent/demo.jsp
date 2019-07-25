<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Scripting element
</h1>
<%!
int a=10;
int b=20;
%>
<%
int sum=a+b;

%>
The value of a:<%=a %> 
<br>
The value of b:<%=b %>
<br>
Sum of a and b :<%=sum  %>
</body>
</html>