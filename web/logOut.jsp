<%--
  Created by IntelliJ IDEA.
  User: Саша
  Date: 15.10.2016
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.setAttribute("user", null);
    session.invalidate();
    response.sendRedirect("Shablon.jsp");
%>
</body>
</html>
