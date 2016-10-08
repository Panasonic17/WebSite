<%--
  Created by IntelliJ IDEA.
  User: Саша
  Date: 29.09.2016
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
hi jek


<%@ page import="Ennty.User" %>
<%
    User user = (User) session.getAttribute("user");
    if(user==null) {  user=new User(); user.login="need Reg";session.setAttribute("user",user);
    }
%>
<% out.print(user.login); %>
</body>
</html>
