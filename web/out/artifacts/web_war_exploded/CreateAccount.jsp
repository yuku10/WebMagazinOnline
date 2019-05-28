<%--
  Created by IntelliJ IDEA.
  User: Alexandru Voinea
  Date: 5/27/2019
  Time: 8:26 PM
  To change this template use File | Settings | File Templates.

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
--%>
<!DOCTYPE>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" >
    <title>MagazinOnline - Register Page</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>


<h1 style="font-size:100px">Register</h1>

<form method="post" action="register">
    <div class="container">
        <div class="c1">
            <label for="Nume">Last name: </label>
            <input  type="text" placeholder="Introdu nume" name="Nume" id = "Nume" required >
        </div>

        <div class="c2">
            <label for="Prenume">First name: </label>
            <input  type="text" placeholder="Enter Prenume" name="Prenume" id = "Prenume" required >
        </div>

        <div class="c3">
            <label for="email">Email: </label>
            <input  type="text" placeholder="Enter email" name="email" id = "email">
        </div>

        <div class="c4">
            <label for="username">Username: </label>
            <input  type="text" placeholder="Enter Username" name="username" id = "username" required >
        </div>

        <div class="c5">
            <label for="parola">Password: </label>
            <input type="password" placeholder="Enter Parola" name="parola" id = "parola" required>
        </div>

        <form action="/register" method="post">
        <div>
            <button class = "btn" type="submit" name="action">Register</button>
        </div>
        </form>

    </div>
</form>

<div id="result" class="result">
    <pre>
        ${requestScope.registerStatus}
    </pre>
</div>

</body>
</html>