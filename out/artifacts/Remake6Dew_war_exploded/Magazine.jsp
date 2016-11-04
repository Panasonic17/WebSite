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
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>3 Column Layout</title>
    <link rel='stylesheet' href='Css/allcss.css' type='text/css' media='all' />
    <script>
        function test(a) {
            $.post( "addProduct",{id: a} );
        }
        $(document).ready(function(){
            $(".forJQuery").click(function(){
               $(this).text("додано")
            });
        });
    </script>
</head>
<body>

<header id="header"><p>
    <%@ include file="Header.jsp"%>
</p></header>
<p>
    make return from ajaks and if no user redirect into Shablon jsp
</p>
<div id="container">
    <main id="center" class="column">
        <%
            List<Product> products= ProductDAO.getAllProducts();
        %>
        <TABLE cellpadding="15" border="1" style="background-color: #ffffcc;">
            <%
                for(Product p:products){
            %>
            <TR>
                <TD><%=p.getType()%></TD>
                <TD><%=p.getDescription()%></TD>
                <TD><%=p.getValue()%></TD>
                <TD> <p class="forJQuery"><input type="button" value="Додати" onclick=test(<%=p.getId()%>)></p></TD>
            </TR>
            <% } %>
        </TABLE>
        <button>оформити замовлення</button>
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
