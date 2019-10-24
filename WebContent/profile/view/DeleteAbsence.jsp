<%@page import="DAO.EtudiantBD"%>
<jsp:useBean id="ab" class="Bean.Absence"></jsp:useBean>
<jsp:setProperty property="*" name="ab"/>

<%
EtudiantBD.deleteAbs(ab);
out.print("ok");
response.sendRedirect("ListeEtudiant.jsp");
%>
