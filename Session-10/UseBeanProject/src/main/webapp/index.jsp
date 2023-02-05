<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>UseBean Demo</h1>

<!-- id is the object of class -->

<jsp:useBean id="obj" class="com.simplilearn.demo.Student" scope="session"></jsp:useBean>


<h3>Value Before  Set</h3>
<!-- let's call getter -->
ROLL NO: <jsp:getProperty property="rollNo" name="obj"/>
NAME: <jsp:getProperty property="name" name="obj"/>


<!-- Let's Call Setter -->
<jsp:setProperty property="rollNo" name="obj" value="20"/>
<jsp:setProperty property="name" name="obj" value="Nikunj Soni"/>

<h3>Value After Set</h3>

ROLL NO: <jsp:getProperty property="rollNo" name="obj"/>
NAME: <jsp:getProperty property="name" name="obj"/>


<br>
<br>
<a href="next.jsp">Click here to check value on Next Page</a>


</body>
</html>