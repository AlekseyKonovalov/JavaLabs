<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Guests book</title>
</head>

<body>
<h1> Гостевая книга </h1>
<p>Добавить запись</p>

<form action="/" method="post">
    <p>Введите имя</p>
    <input type="text" name="nameUser"/>
    <p>Введите текст</p>
    <input type="text" name="textUser"/>
    <p></p>
    <input type="submit" value="Отправить"/>
</form>

<table cellpadding="20">
    <tr>
        <th>Дата</th>
        <th>Имя</th>
        <th>Сообщение</th>
    </tr>
    <c:forEach var="record" items="${records}">
        <tr>
            <td><c:out value="${record.dateRecord}"/></td>
            <td><c:out value="${record.userName}"/></td>
            <td><c:out value="${record.textUser}"/></td>
        </tr>
    </c:forEach>
</table>


</body>
</html>