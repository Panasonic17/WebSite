<%@ page import="Ennty.User" %>
<%--
  Created by IntelliJ IDEA.
  User: Саша
  Date: 10.10.2016
  Time: 17:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel='stylesheet' href='Css/allcss.css' type='text/css' media='all' />
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>3 Column Layout</title>
    <link rel='stylesheet' href='Css/allcss.css' type='text/css' media='all'/>

    <style>
        .d1 {
            width: 50%; float: left;
        }
        .forImg
        {
            width: 40%;
            height: 40%;
        }
        .forButon
        {
            float: right;
        }
    </style>
</head>

<body>

<header id="header"><p>
    <%@ include file="Header.jsp" %>
</p></header>

<div id="container">
    <main id="center" class="column">
        <div float: left; >
            <%--info--%>
            <div class="d1">
              

            </div>
            <%--foto--%>
            <div class="d1" >
                <img class="forImg" src="imgs/images.png" alt="альтернативный текст">
                <button class="myButton"> add foto</button>
            </div>

        </div>
    </main>
    <%@ include file="LeftColumn.jsp" %>

    <div id="right" class="column">
        <h3>Right heading</h3>
        <p></p>
    </div>
</div>
<div id="footer-wrapper">
    <footer id="footer"><p>Footer...</p></footer>
</div>

</body>

</html>
