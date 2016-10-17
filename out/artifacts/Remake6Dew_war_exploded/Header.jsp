<%--
  Created by IntelliJ IDEA.
  User: Саша
  Date: 29.09.2016
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="Ennty.User" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    User user = (User) session.getAttribute("user");
    if(user!=null) {
        out.print("HI  "); out.print(user.login);
%>
    <input type="button" value="log out" onClick='location.href="logOut.jsp"'>
<% } else
    {%>
<form  action="login" method="post">
    Login
    <input type="text" name="login">
    pass
    <input type="text" name="passvord">

    Go <input type="submit">
</form>
<form>
    <input type="button" value="Registr" onClick='location.href="Registr.jsp"'>
</form>
<%}%>
</body>
</html>
