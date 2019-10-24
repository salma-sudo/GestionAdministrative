<%@page import="Bean.Login_Bean"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
input[type=button] {
    background-color: #4CAF50; /* Green */
  border: none;
  color: white;
  padding: 15px 32px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  


</style>
 <script type="text/javascript">
	var test=0;
    function showImage(){if(test==0){
        document.getElementById('loadingImage').style.visibility="visible";
        test=1;

    }else{
        document.getElementById('loadingImage').style.visibility="hidden";
		test=0;
    }
    }

   

    </script>
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
	int num=obj_Login_Bean.getNum_classe();
	System.out.println(num);
		if(num==1){

			%>

		    <img id="loadingImage" src="classe1.png" style="visibility:hidden"/>
		    <input type="button" value="Show Button" onclick="showImage();"/>
	<%	}else if(num==2){
		
		%>

		    <img id="loadingImage" src="classe2.png" style="visibility:hidden"/>
		    <input type="button" value="Show Button" onclick="showImage();"/>
<%
	}else {
		%>

		    <img id="loadingImage" src="classe3.png" style="visibility:hidden"/>
		    <input type="button" value="Show Button" onclick="showImage();"/>

<%
	}}
%>
</body>
</html>