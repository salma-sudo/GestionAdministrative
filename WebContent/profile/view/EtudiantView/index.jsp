<%@page import="Bean.Login_Bean"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
 
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
		    window.location.href="http://localhost:8080/GestionEtudiant/index2.jsp";
		</script>
	<%
	}else{


	%>

<button onclick="window.location.href='http://localhost:8080/GestionEtudiant/user-home-page'" class="btn btn-success" style="width:200px;  margin-top:100px; margin-left:100px;">Home</button>
<button onclick="window.location.href='http://localhost:8080/GestionEtudiant/user-profile'" class="btn btn-success" style="width:200px;  margin-top:100px; margin-left:100px;">Profile</button>

<button onclick="window.location.href='adduserform.jsp'" class="btn btn-success" style="width:200px;  margin-top:100px; margin-left:100px;">Ajouter Etudiant</button>
<button onclick="window.location.href='viewusers.jsp'" class="btn btn-success" style="width:200px;  margin-top:100px; margin-left:130px;">Afficher la liste des Etudiants</button>

<%
	}
%>
</body>
</html>