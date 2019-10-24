<%@page import="DAO.AbsenceBD"%>
<jsp:useBean id="absence" class="Bean.Absence"></jsp:useBean>
<jsp:setProperty property="*" name="absence"/>

<%
int i=AbsenceBD.save(absence);
if(i>0){
response.sendRedirect("AfficherEtudiant.jsp");
}
%>