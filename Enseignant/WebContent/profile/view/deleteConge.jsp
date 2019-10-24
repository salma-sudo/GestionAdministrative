<%@page import="DAO.CongeBD"%>
<jsp:useBean id="u" class="Bean.Conge"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
CongeBD.delete(u);
response.sendRedirect("list_conge.jsp");
%>