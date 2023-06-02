<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 02.06.2023
  Time: 9:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Response</title>
</head>
<body>
<h1>Привет <%= request.getParameter("name")%>!</h1>
<h1>Ваш возраст: <%= request.getParameter("age")%></h1>
<h1>Ваш город: <%= request.getParameter("city")%></h1>
</body>
</html>
