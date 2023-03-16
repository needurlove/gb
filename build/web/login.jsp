<%-- 
    Document   : login.jsp
    Created on : 15 мар. 2023 г., 03:15:55
    Author     : yo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
    </head>
    <body>
        <form action="/gb/login" method="POST">
            <input name="name" type="text"/>
            <input name="pwd" type="password"/>
            <input type="submit"/>
        </form>
    </body>
</html>
