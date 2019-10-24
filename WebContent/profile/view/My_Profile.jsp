<%@page import="Bean.Login_Bean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Profile</title>
<style >body {
  background-color: #1F2739;
  

}
h1 {
  font-size:3em; 
  font-weight: 300;
  line-height:1em;
  text-align: center;
  color: #4DC3FA;
}
  </style>
</head>
<body>

<%
	Login_Bean obj_Login_Bean=(Login_Bean)session.getAttribute("user_session");
	if(obj_Login_Bean==null){
		session.setAttribute("login_message", "Please login first");
	

	%>
	<script type="text/javascript">
		    window.location.href="http://localhost:8080/Enseignant/index2.jsp";
		</script>
	<%	
	}else{
	%>

<center>
<h1>Welcome <%=obj_Login_Bean.getUser_name() %></h1>

<button onclick="window.location.href='http://localhost:8080/Enseignant/user-home-page'" class="btn btn-success" style="width:200px;  margin-top:100px; margin-left:100px;">Home</button>
<button onclick="window.location.href='http://localhost:8080/Enseignant/profile/view/EtudiantView/index.jsp'" class="btn btn-success" style="width:200px;  margin-top:100px; margin-left:100px;">GestionEtudiant</button>
<button onclick="window.location.href='http://localhost:8080/Enseignant/profile/view/EnseignantView/index1.jsp'" class="btn btn-success" style="width:200px;  margin-top:100px; margin-left:100px;">GestionEmployer</button>
<button onclick="window.location.href='http://localhost:8080/Enseignant/profile/view/index3.jsp'" class="btn btn-success" style="width:200px;  margin-top:100px; margin-left:100px;">Ajouter Emploie du temps </button>

<button onclick="window.location.href='http://localhost:8080/Enseignant/Signoutcontroller'" class="btn btn-success" style="width:200px;  margin-top:100px; margin-left:100px;">LogOut</button>




</center>

<%	
	}
	%>
</body>
</html>