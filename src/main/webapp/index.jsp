<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Form</title>
</head>
<body>
<form action="save-request" method="post">
    Имя: <input name="name" />
    <br><br>
    Возраст: <input name="age" type="number" min=1 />
    <br></br>
    Город: <input name="city" />
    <br><br>
    <input type="submit" value="Submit" />
</form>
</body>
</html>
