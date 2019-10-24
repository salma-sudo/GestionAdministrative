<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <form action="TraitementConge"  method="post">
 		 <table class="table table-striped">
 		 	 <tr>		
 		 			
					<td>name: <input type ="text" name="name"><td>
					<td><button class="btn btn-theme" type="submit" value="OK">Ok</button><td>
			</tr>	
		</table>			
		</form>
         
        <!-- row -->
        
 		 <table class="table table-hover">
<tr><th>Name</th><th>Date de début</th><th>Date de fin</th><th>etat du conge</th><th>Raison </th></tr>
<c:forEach items="${modele.enseignantConge}" var="u">
	<tr>
	<td>${u.getName()}</td>
	<td>${u.getDate_d()}</td>
	<td>${u.getDate_f()}</td>
	<td>${u.getEtat()}</td>
	<td>${u.getRaison()}</td>
	
	<td><button class="btn btn-primary btn-xs" onclick="window.location.href='EditEtudiant.jsp?id=${u.getId()}'" ><i class="fa fa-pencil"></i></button>
	</td>
	<td><button class="btn btn-danger btn-xs" onclick="window.location.href='deleteuser.jsp?id=${u.getId()}'"><i class="fa fa-trash-o "  ></i></button>
	</td>
	</tr>
</c:forEach>
</table>

</body>
</html>