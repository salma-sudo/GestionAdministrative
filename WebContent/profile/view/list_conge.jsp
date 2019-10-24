<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="Bean.Login_Bean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ajouter Etudiant</title>

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
  
        
    </head>
  <script src="lib/chart-master/Chart.js"></script>
</head>
</head>
<body>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


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

<section id="container">
    <!-- **********************************************************************************************************************************************************
        TOP BAR CONTENT & NOTIFICATIONS
        *********************************************************************************************************************************************************** -->
    <!--header start-->
    <header class="header black-bg">
      <div class="sidebar-toggle-box">
        <div class="fa fa-bars tooltips" data-placement="right" data-original-title="Toggle Navigation"></div>
      </div>
      <!--logo start-->
      <a href="index.html" class="logo"><b>YAP<span>MA</span></b></a>
      <!--logo end-->
      <div class="nav notify-row" id="top_menu">
        
        
          
      </div>
      <div class="top-menu">
        <ul class="nav pull-right top-menu">
         
          <li><button onclick="window.location.href='http://localhost:8080/Enseignant/Signoutcontroller'" class="logout" >LogOut</button></li>
        </ul>
      </div>
    </header>
    <!--header end-->
     <!-- **********************************************************************************************************************************************************
        MAIN SIDEBAR MENU
        *********************************************************************************************************************************************************** -->
    <!--sidebar start-->
    <aside>
      <div id="sidebar" class="nav-collapse ">
        <!-- sidebar menu start-->
        <ul class="sidebar-menu" id="nav-accordion">
          
          <p class="centered"><a href="AcueilAdmin.jsp"><img src="img3/admin.png" class="img-circle" width="80"></a></p>
          <h5 class="centered"><%=obj_Login_Bean.getNom()%></h5>
          
          
			<li class="sub-menu">
            <a href="javascript:;">
              <i class="fa fa-cogs"></i>
              <span>Gestion des Etudiants</span>
            </a>
	            <ul class="sub">
	              <li><a href="AjouterEtudiant.jsp">Ajouter �tudiant </a></li>
	              <li><a href="ListeEtudiant.jsp"> G�rer la  liste des �tudiants </a> </li>
	              <li><a href="GestionAbsence.jsp"> G�rer les absences </a> </li>
	             </ul>
          </li>
          <li class="sub-menu">
            <a href="javascript:;">
              <i class="fa fa-th"></i>
              <span> Gestion des Enseignants  </span>
              </a>
				<ul class="sub">
	              <li><a href="AjouterEnseignant.jsp">Ajouter un enseignant </a></li>
	              <li><a href="EnseignantView/viewusers1.jsp"> G�rer la liste des enseignant  </a>
	              <li><a href="list_conge.jsp"> les demandes de cong�s </a> </li>
	         </li>
	        	</ul>
	       <li class="sub-menu">
            <a href="javascript:;">
              <i class="fa fa-tasks"></i>
              <span>Ajouter Emploie Du temps</span>
              </a>
            <ul class="sub">
              <li><a href="AjouterEm_temps.jsp">Pour Enseignant</a></li>
              <li><a href="AjouterEm_temps.jsp">Pour Etudiant</a></li>
              </ul>
          </li>
	         
	            
          </ul>
        <!-- sidebar menu end-->
      </div>
    </aside>
    <!--sidebar end-->
     <!--main content start-->
    <section id="main-content">
      <section class="wrapper">
     <%@page import="DAO.EnseignantBD,Bean.*,java.util.*"%>
     <%
List<EnseignantConge> list=EnseignantBD.getEnseignantConge();
request.setAttribute("list",list);
%>
     <!--  
       <form action="TraitementConge"  method="post">
 		 <table class="table table-striped">
 		 	 <tr>		
 		 			
					<td>name: <input type ="text" name="name"><td>
					<td><button class="btn btn-theme" type="submit" value="OK">Ok</button><td>
			</tr>	
		</table>			
				</form>-->   
         
        <!-- row -->
         <div class="form-group ">
        
 		 <table class="table table-hover">
<tr><th>Name</th><th>Date de d�but</th><th>Date de fin</th><th>etat du conge</th><th>Raison </th><th>Refuser un cong� </th></tr>
<c:forEach items="${list}" var="u">
	<tr>
	<td>${u.getName()}</td>
	<td>${u.getDate_d()}</td>
	<td>${u.getDate_f()}</td>
	<td>${u.getEtat()}</td>
	<td>${u.getRaison()}</td>
	<td><button class="btn btn-danger btn-xs" onclick="window.location.href='deleteConge.jsp?id=${u.getId()}'" ><i class="fa fa-trash-o " ></i></button></td>

</c:forEach>
</table>
<button onclick="window.location.href='deman_conge.jsp'" class="btn btn-theme" style="width:555px; margin-top:20px;  ">Ajouter Cong� </button>

 		 </div>
        <!-- /row -->
      
        
      </section>
      <!-- /wrapper -->
    </section>

    <!--main content end-->
    <!--footer start-->
  
    <!--footer end-->
  </section>
  <!-- js placed at the end of the document so the pages load faster -->
  <script src="lib/jquery/jquery.min.js"></script>

  <script src="lib/bootstrap/js/bootstrap.min.js"></script>
  <script class="include" type="text/javascript" src="lib/jquery.dcjqaccordion.2.7.js"></script>
  <script src="lib/jquery.scrollTo.min.js"></script>
  <script src="lib/jquery.nicescroll.js" type="text/javascript"></script>
  <script src="lib/jquery.sparkline.js"></script>
  <!--common script for all pages-->
  <script src="lib/common-scripts.js"></script>
  <script type="text/javascript" src="lib/gritter/js/jquery.gritter.js"></script>
  <script type="text/javascript" src="lib/gritter-conf.js"></script>
  <!--script for this page-->
  <script src="lib/sparkline-chart.js"></script>
  <script src="lib/zabuto_calendar.js"></script>
 <!--   <script type="text/javascript">
    $(document).ready(function() {
      var unique_id = $.gritter.add({
        // (string | mandatory) the heading of the notification
        title: 'Welcome to Dashio!',
        // (string | mandatory) the text inside the notification
        text: 'Hover me to enable the Close Button. You can hide the left sidebar clicking on the button next to the logo.',
        // (string | optional) the image to display on the left
        image: 'img3/ui-sam.jpg',
        // (bool | optional) if you want it to fade out on its own or just sit there
        sticky: false,
        // (int | optional) the time you want it to be alive for before fading out
        time: 8000,
        // (string | optional) the class name you want to apply to that specific message
        class_name: 'my-sticky-class'
      });

      return false;
    });
  </script>-->
  <script type="application/javascript">
    $(document).ready(function() {
      $("#date-popover").popover({
        html: true,
        trigger: "manual"
      });
      $("#date-popover").hide();
      $("#date-popover").click(function(e) {
        $(this).hide();
      });

      $("#my-calendar").zabuto_calendar({
        action: function() {
          return myDateFunction(this.id, false);
        },
        action_nav: function() {
          return myNavFunction(this.id);
        },
        ajax: {
          url: "show_data.php?action=1",
          modal: true
        },
        legend: [{
            type: "text",
            label: "Special event",
            badge: "00"
          },
          {
            type: "block",
            label: "Regular event",
          }
        ]
      });
    });

    function myNavFunction(id) {
      $("#date-popover").hide();
      var nav = $("#" + id).data("navigation");
      var to = $("#" + id).data("to");
      console.log('nav ' + nav + ' to: ' + to.month + '/' + to.year);
    }
  </script>
  
<%
	}
%>
</body>
</html>