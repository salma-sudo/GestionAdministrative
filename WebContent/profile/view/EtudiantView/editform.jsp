<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Colorlib Templates">
<meta name="author" content="Colorlib">
<meta name="keywords" content="Colorlib Templates">
<title>Edit Form</title>
<link href="vendor2/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet" media="all">
    <link href="vendor2/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet" media="all">
    <!-- Font special for pages-->
    <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i" rel="stylesheet">

    <!-- Vendor CSS-->
    <link href="vendor2/select2/select2.min.css" rel="stylesheet" media="all">
    <link href="vendor2/datepicker/daterangepicker.css" rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="css2/main.css" rel="stylesheet" media="all">
</head>
<body>
<%@page import="DAO.EtudiantBD,Bean.Etudiant"%>

<%
String id=request.getParameter("id");
Etudiant u=EtudiantBD.getRecordById(Integer.parseInt(id));
%>

<div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
        <div class="wrapper wrapper--w790">
            <div class="card card-5">
                <div class="card-heading">
                    <h2 class="title"> Registration Form</h2>
                </div>
                <div class="card-body">
<form action="edituser.jsp" method="post">
<input type="hidden" name="id" value="<%=u.getId() %>"/>
<div class="form-row">
                            <div class="name">Name</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="name">
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Password</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="password" name="password">
                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="name">Email</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="email" name="email">
                                </div>
                            </div>
                        </div>
                              <label class="label label--block">Sex</label>
                              <div class="form-row" style="margin-top: 20px; margin-left: 120px;">
                                  <label class="radio-container ">Male
                                      <input type="radio" checked="checked" name="sex" value="male">
                                      <span class="checkmark"></span>
                                  </label>
                                  <label class="radio-container" style="margin-left: 100px;">Female
                                      <input type="radio" name="sex" value="female">
                                      <span class="checkmark"></span>
                                  </label>
                              </div>
                          <div class="form-row">
                              <div class="name">Tel</div>
                              <div class="value">
                                  <div class="input-group">
                                      <input class="input--style-5" type="text" name="tel">
                                  </div>
                              </div>
                          </div>
                        <div class="form-row">
                            <div class="name">Num_classe</div>
                            <div class="value">
                                <div class="input-group">
                                    <div class="rs-select2 js-select-simple select--no-search">
                                        <select name="num_classe">
                                            <option disabled="disabled" selected="selected">Choose option</option>
                                            <option> 1</option>
                                            <option> 2</option>
                                            <option> 3</option>
                                        </select>
                                        <div class="select-dropdown"></div>
                                    </div>
                                </div>
                            </div>
                        </div>

                        <div>
                            <input class="btn btn--radius-2 btn--red" type="submit" value="Modifier Etudiant"/>
                          </div>
</form>
 </div>
            </div>
        </div>
    </div>
 <!-- Jquery JS-->
    <script src="vendor2/jquery/jquery.min.js"></script>
    <!-- Vendor JS-->
    <script src="vendor2/select2/select2.min.js"></script>
    <script src="vendor2/datepicker/moment.min.js"></script>
    <script src="vendor2/datepicker/daterangepicker.js"></script>

    <!-- Main JS-->
    <script src="js2/global.js"></script>
</body>
</html>