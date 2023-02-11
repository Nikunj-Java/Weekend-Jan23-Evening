<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Format Library Example</h1>


<c:set var="num" value="1234.5678"></c:set>


Number:<fmt:formatNumber maxFractionDigits="2" value="${num }"></fmt:formatNumber>
<br>
<h2>Date Format Demo</h2>

<c:set var="today" value="<%=new Date() %>"></c:set>
smallDate:<fmt:formatDate value="${today }" dateStyle="short" timeStyle="short" type="both"/><br>

mediumDate:<fmt:formatDate value="${today }" dateStyle="medium" timeStyle="medium" type="both"/><br>

longDate:<fmt:formatDate value="${today }" dateStyle="long" timeStyle="long" type="both"/><br>

<br><br>

Formatted Date:<fmt:formatDate value="${today }" pattern="yyyy-MM-dd"/>


</body>
</html>