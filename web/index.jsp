<%@page import="com.mysoft.GuestBook" %>
<%-- 
    Document   : index
    Created on : 14 мар. 2023 г., 17:19:16
    Author     : yo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Garbanzo</title>
    </head>
    <body>
        <%=GuestBook.getAllPosts().size()%>
        <a href="about.jsp">
        <img src="swag.jpg">
        </a>
        
    </body>
</html>
