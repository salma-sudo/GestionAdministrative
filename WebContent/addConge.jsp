<%@page import="DAO.CongeBD"%>
<jsp:useBean id="conge" class="Bean.Conge"></jsp:useBean>
<jsp:setProperty property="*" name="conge"/>

<%
int i=CongeBD.save(conge);
if(i>0){
response.sendRedirect("deman_conge.jsp");
}else{
response.sendRedirect("404.html");
}
%>