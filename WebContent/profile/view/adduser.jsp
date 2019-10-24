<%@page import="DAO.EtudiantBD"%>
<jsp:useBean id="u" class="Bean.Etudiant"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i=EtudiantBD.save(u);
if(i>0){
response.sendRedirect("adduser-success.jsp");
}else{
response.sendRedirect("adduser-error.jsp");
}
%>