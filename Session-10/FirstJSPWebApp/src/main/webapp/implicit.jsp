<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Implicit Demo</h2>

<br>

<!-- Handle Parameters -->
<%
String responseCheck=request.getParameter("office");

if(responseCheck!=null){
	response.setStatus(response.SC_MOVED_TEMPORARILY);
	response.setHeader("Location", "resp-redirect.jsp?office="+responseCheck);
}
%>
 
 <a href="implicit.jsp?office=head_office">Check Use of Response  and request Object</a>

<br>

<br>

<!-- Handle Error -->
<% String error=request.getParameter("error");
if(error!=null)
	throw new RuntimeException("Exception Occured");

%>


<a href="implicit.jsp?error=1">Check Use of Error</a>
<br>
<br>
<% 

String serverName=request.getServerName();
out.print("Server Name:"+ serverName+"<br>");
out.print("Servlet Name:"+ config.getServletName()+"<br>");
out.print("Server Info:"+ application.getServerInfo()+"<br>");
out.print("Page Details:"+ page.toString()+"<br>");

pageContext.setAttribute("userid", "test@gmail.com"+"<br>");
out.print("Page Contax Attribute:"+ pageContext.getAttribute("userid")+"<br>");



%>



</body>
</html>