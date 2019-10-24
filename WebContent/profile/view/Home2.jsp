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
  
 <link href="img3/favicon.png" rel="icon">
  <link href="img3/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Bootstrap core CSS -->
  <link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <!--external css-->
  <link href="lib/font-awesome/css/font-awesome.css" rel="stylesheet" />
  <link rel="stylesheet" type="text/css" href="css3/zabuto_calendar.css">
  <link rel="stylesheet" type="text/css" href="lib/gritter/css/jquery.gritter.css" />
  <!-- Custom styles for this template -->
  <link href="css3/style.css" rel="stylesheet">
  <link href="css3/style-responsive.css" rel="stylesheet">
  <link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
   <script src="lib/chart-master/Chart.js"></script>
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
<title>Insert title here</title>
</head>

<body >

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
<h1>Welcome <%=obj_Login_Bean.getId() %></h1>

<button onclick="window.location.href='http://localhost:8080/Enseignant/user-profile'" class="btn btn-success" style="width:200px;  margin-top:100px; margin-left:100px;">Profile</button>
<button onclick="window.location.href='http://localhost:8080/Enseignant/profile/view/EtudiantView/index.jsp'" class="btn btn-success" style="width:200px;  margin-top:100px; margin-left:100px;">GestionEtudiant</button>
<button onclick="window.location.href='http://localhost:8080/Enseignant/profile/view/EnseignantView/index1.jsp'" class="btn btn-success" style="width:200px;  margin-top:100px; margin-left:100px;">GestionEmployer</button>
<button onclick="window.location.href='http://localhost:8080/Enseignant/profile/view/index3.jsp'" class="btn btn-success" style="width:200px;  margin-top:100px; margin-left:100px;">Ajouter Emploie du temps </button>

<button onclick="window.location.href='http://localhost:8080/Enseignant/Signoutcontroller'" class="btn btn-success" style="width:200px;  margin-top:100px; margin-left:100px;">LogOut</button>






<%
	}
%>



</center>
</body>
</html>
