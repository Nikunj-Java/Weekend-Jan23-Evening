<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Function Tag Examples</h1>

<c:set var="name" value="SIMPLI"></c:set>
<c:set var="name1" value="Learn"></c:set>

Lowercase: ${fn:toLowerCase(name)}<br>
uppercase: ${fn:toUpperCase(name1)}<br>


<h3>Iteration</h3>
<c:set var="str" value="Hello World Message"></c:set>

<c:forEach items="${str }" var="x">

				<c:out value="${fn:toUpperCase(x) }"></c:out>

</c:forEach>




</body>
</html>