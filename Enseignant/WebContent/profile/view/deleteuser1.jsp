<%@page import="DAO.EnseignantBD"%>
<jsp:useBean id="u" class="Bean.Enseignant"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
EnseignantBD.delete(u);
response.sendRedirect("ListeEnseignant.jsp");
%>