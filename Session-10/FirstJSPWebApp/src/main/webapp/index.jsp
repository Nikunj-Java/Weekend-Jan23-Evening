<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>First JSP APP</h1>

<br>

<% out.print("Hello World");%>

<br>
<h2>ScriptLet Example</h2>
<br>
<!-- Scriptlet -->
<% String name="Nikunj Soni";%>

<%
int a=10;
int b=20;
int c=a+b;
out.print("Result is : "+c);
%>
<br>

<!-- Expression -->
<h2>Expression Example</h2>
<%="My name is:"+name %>
<br>

<%! int cube(int n){
	return n*n*n;
} %>

<%= "Cube of 5 is: "+cube(5) %>
<br>
<%= new Date() %>

<br>
<h2>Implicit Objects</h2>

<a href="implicit.jsp">Click Here For Implicit Object</a>


</body>
</html>