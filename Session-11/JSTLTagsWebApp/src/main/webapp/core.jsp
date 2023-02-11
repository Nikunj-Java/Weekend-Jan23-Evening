<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<!-- download jstl-1.2.jar file from java2s.com -->
<!-- link:http://www.java2s.com/Code/Jar/j/Downloadjstl12jar.htm -->

<c:set var="income" value="${4000*50 }" scope="session"></c:set>

Income: <c:out value="${income}"></c:out>

<c:remove var="income"/>

After Remove The Income: <c:out value="${income}"></c:out>


<br>
<!-- Exception Handling -->
<c:catch var="ex">

<% int c=10/0; %>

</c:catch>

<br>
Exception is: <c:out value="${ex }"></c:out>

<br>


<!-- if -->

<c:set var="test" value="700"></c:set>

<c:if test="${test>500 }">
	<c:out value="The value is more than 500"></c:out>

</c:if>


<br>


<!-- if and else -->

<c:choose>
	<c:when test="${test>1000 }">
	
		<c:out value="The Value is More than 1000"></c:out>
	
	</c:when>
	<c:otherwise>
			<c:out value="The Value is less than 1000"></c:out>
	
	</c:otherwise>

</c:choose>


</body>
</html>