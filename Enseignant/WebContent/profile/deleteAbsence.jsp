<%@page import="DAO.AbsenceBD"%>
<jsp:useBean id="u" class="Bean.Absence"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%AbsenceBD.delete(u);
response.sendRedirect("ListeAbsences.jsp");
%>