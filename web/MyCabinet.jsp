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
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>3 Column Layout</title>
    <link rel='stylesheet' href='Css/allcss.css' type='text/css' media='all' />

</head>

<body>

<header id="header"><p>
    <%@ include file="Header.jsp"%>
</p></header>

<div id="container">
    <main id="center" class="column">
        <article>
            <h1>Heading</h1>
            <p><script>generateText(50)</script></p>
        </article>
    </main>
    <%@ include file="LeftColumn.jsp"%>

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
