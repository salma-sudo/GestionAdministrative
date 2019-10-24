<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="FaireAbsence" method="post">
					filière :<input type ="text" name="fil">
					Groupe:<input type ="text" name="group">
					Année Scolaire : <input type ="text" name="asc">
					<input type ="submit" value= "OK">
				</form>
			<form action="AjouterAbsence" method="post">	
				<table border="1" width="80%">
				<tr>
				<th>Nom</th><th>Prénom</th><th>Absence</th>
				</tr>
				<c:forEach items="${modele.etudiant}" var="e" >
				<tr>
					
					<td>${e.nom} </td>
					<td>${e.prenom} </td>
					<td><input type="checkbox"  name="Check" value="${e.id}"></td>
					
				</tr>
				</c:forEach>
				
			</table>
			<input type ="submit" value= "OK">
			
			</form>
</html>