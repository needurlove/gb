<%-- 
    Document   : posts
    Created on : 14 мар. 2023 г., 19:52:22
    Author     : yo
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Posts to the guestbook</title>
    </head>
    <body>
        <table border="1">
            <c:forEach var="post" items="${requestScope.posts}">
                <tr>
                    <td><c:out value="${post.id}"></c:out></td>
                    <td><c:out value="${post.txt}"></c:out></td>
                    <td><a stlye="color:red" href="/gb/deletePost?id=${post.id}">x</a></td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
