<%@page import="DAO.EnseignantBD"%>
<jsp:useBean id="u" class="Bean.Enseignant"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i=EnseignantBD.update(u);
response.sendRedirect("ListeEnseignant.jsp");
%>