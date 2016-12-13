<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Decoder</title>
    </head>

    <body>

        <h1>Decoder</h1>

        <form action="/decoder" method="post">
            <p>Введите текст для расшифровки:</p>
            <input type="text" name="textForEncode"/>
            <input type="submit" value="Отправить"/>
        </form>

        <p>Результат</p>
        <p>${result}</p>

    </body>
</html>