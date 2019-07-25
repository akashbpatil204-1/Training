<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>JSP Expression</h1>
<h2>welcome ${param.t1}</h2>
<% 
session.setAttribute("abc", "session scope object");


%>
Result :${sessionScope.abc}

</body>
</html>