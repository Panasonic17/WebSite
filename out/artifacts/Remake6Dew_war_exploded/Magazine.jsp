<%@ page import="java.util.List" %>
<%@ page import="Ennty.Product" %>
<%@ page import="DAO.UserDAO" %>
<%@ page import="DAO.ProductDAO" %>
<%@ page import="java.util.LinkedList" %><%--
  Created by IntelliJ IDEA.
  User: Саша
  Date: 16.10.2016
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>3 Column Layout</title>
    <link rel='stylesheet' href='Css/allcss.css' type='text/css' media='all' />
    <script>
        function test(a) {
            alert(a);
        }
    </script>

</head>

<body>

<header id="header"><p>
    <%@ include file="Header.jsp"%>
</p></header>
<div id="container">
    <main id="center" class="column">
        <%
            List<Product> products= ProductDAO.getAllProducts();
            List<Integer> idProducts=new LinkedList<Integer>();
        %>
        <TABLE cellpadding="15" border="1" style="background-color: #ffffcc;">
            <%
                for(Product p:products){
            %>
            <TR>
                <TD><%=p.getType()%></TD>
                <TD><%=p.getDescription()%></TD>
                <TD><%=p.getValue()%></TD>
                <TD> <p><input type="button" value="Додати" onclick=test(<%=p.getId()%>)></p></TD>
            </TR>
            <% } %>
        </TABLE>
        <input type="button" value="Оформити замовлення" onclick="">
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
