<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<%@page import="Model.Login_model"%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj_Login_Bean" class="Bean.Login_Bean"></jsp:useBean>
<jsp:setProperty property="*" name="obj_Login_Bean"/>
<%@page import="DAO.PointageBD"%>
<jsp:useBean id="u" class="Bean.Pointage"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
 <%
 System.out.println(obj_Login_Bean.getUser_name());
 System.out.println(obj_Login_Bean.getPassword());
 System.out.println(obj_Login_Bean.getType());

 
 Login_model obj_Login_Modal=new Login_model();
 
 boolean flag=obj_Login_Modal.check_user_name(obj_Login_Bean);
 
 
 
 
 if(flag ){
	 System.out.println("eeeeeeeeeeeee");

	 if(obj_Login_Bean.getType().equals("Admin")){
		 System.out.println("eeeeeeeeeeeee");

		 session.setAttribute("user_session", obj_Login_Bean);
		 %>
			<script type="text/javascript">
			    window.location.href="http://localhost:8080/Enseignant/profile/view/AcueilAdmin.jsp";</script>
		<%	
	 }else if(obj_Login_Bean.getType().equals("Employer")){
		 System.out.println("bbbbbb");
		 session.setAttribute("user_session", obj_Login_Bean);
		 int i=PointageBD.save(obj_Login_Bean.getId());
		 System.out.println(i);
		 if(i>0){
		 %>
			<script type="text/javascript">
			
			
			    window.location.href="http://localhost:8080/Enseignant/Accueil_Enseignant.jsp";</script>
		<%	
		 }
		 
		
	 } else{
		 session.setAttribute("user_session", obj_Login_Bean);
		 %>
			<script type="text/javascript">
			    window.location.href="http://localhost:8080/Enseignant/accueil_etu.jsp";</script>
		<%	
	 }
	 
 }else{
	
	 
	 session.setAttribute("login_message", "Login Failed, User name and Password are Wrong");
	 
%>
		<script type="text/javascript">
		    window.location.href="http://localhost:8080/Enseignant/index2.jsp";
		</script>

<%	 
	 
	 
 }
 
 %>
 
</body>
</html>