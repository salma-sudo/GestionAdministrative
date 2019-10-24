<%@page import="DAO.EtudiantBD"%>
<jsp:useBean id="u" class="Bean.Etudiant"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
EtudiantBD.delete(u);
response.sendRedirect("ListeEtudiant.jsp");
%>