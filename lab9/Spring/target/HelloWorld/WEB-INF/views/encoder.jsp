<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Encoder</title>
    </head>

    <body>

        <h1>Encoder</h1>

        <form action="/encoder" method="post">
            <p>Введите текст для шифрования:</p>
            <input type="text" name="textForDecode"/>
            <input type="submit" value="Отправить"/>
        </form>

        <p>Результат</p>
        <p>${result}</p>

    </body>
</html>