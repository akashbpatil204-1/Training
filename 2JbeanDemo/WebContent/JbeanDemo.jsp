<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h1>Java Bean Demo</h1>
<hr>
<h2>
<jsp:useBean id ="p1" class="com.Person"></jsp:useBean> 
<jsp:setProperty property="name" name="p1" value="Akash"/>
<jsp:setProperty property="age" name="p1" value="25"/>

Your name : <jsp:getProperty property ="name" name="p1"/>
<%
com.Person p=new com.Person();
p.setName("yo");
p.setAge(20);
out.println(p.getName());






%>



</h2>
</body>
</html>