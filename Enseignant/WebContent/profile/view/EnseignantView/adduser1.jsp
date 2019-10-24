<%@page import="DAO.EnseignantBD"%>
<jsp:useBean id="u" class="Bean.Enseignant"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i=EnseignantBD.save(u);
if(i>0){
response.sendRedirect("AjouterEnseignant.jsp");
}else{
response.sendRedirect("AjouterEnseignant.jsp");
}
%>