<!DOCTYPE html>

<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Liste les Employers</title>
      <link rel="stylesheet" href="style.css">

</head>
<body>

<%@page import="DAO.EnseignantBD,Bean.*,java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<%
List<Enseignant> list=EnseignantBD.getAllRecords();
request.setAttribute("list",list);
%>

<table class="container">
<tr><th>Id</th><th>Name</th><th>Password</th><th>Email</th><th>Sex</th><th>Tel</th><th>Edit</th><th>Delete</th></tr>
<c:forEach items="${list}" var="u">
	<tr>
	<td>${u.getId()}</td>
	<td>${u.getName()}</td>
	<td>${u.getPassword()}</td>
	<td>${u.getEmail()}</td>
	<td>${u.getSex()}</td>
	<td>${u.getTel()}</td>
	
	<td><a href="editform1.jsp?id=${u.getId()}">Edit</a></td>
	<td><a href="deleteuser1.jsp?id=${u.getId()}">Delete</a></td>
	</tr>
</c:forEach>
</table>
<br/>    <button onclick="window.location.href='adduserform1.jsp'" class="btn btn-success" style="width:220px; margin-top:20px; margin-left:115px; ">Ajouter Employer</button>


</body>
</html>