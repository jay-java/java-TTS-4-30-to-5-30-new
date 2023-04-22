<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
<%
User u = null;
if(session.getAttribute("data")!=null){
	u = (User)session.getAttribute("data");
}
else{
	response.sendRedirect("login.jsp");
}
%>
<h1>Welcome, <%=u.getName() %></h1>
<h1><a href="logout.jsp">Logout</a></h1>


</body>
</html>