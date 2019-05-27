<%--
  Created by IntelliJ IDEA.
  User: Alexandru Voinea
  Date: 5/14/2019
  Time: 4:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Magazin online - Main Page</title>
    <link rel="stylesheet" >
</head>

<body>
<!-- banner -->
<div class>
    <div class>
        <h1 style="font-size:100px">Magazin Online</h1>
    </div>
</div>


<div>
    <!--casuta de login-->
    <div class="login-text">
        <p><b>Already have an account?</b></p>

        <div class="container">
            <form method = "post" action = "home">
                <div>
                    <label for="username">Username: </label>
                    <input  type="text" placeholder="Enter Username" name="username" id = "username" required >
                </div>

                <div>
                    <label for="password">Parola: </label>
                    <input type="password" placeholder="Enter Password" name="password" id = "password" required>
                </div>

                <div>
                    <button class = "btn" type="submit" name="action">Login</button>
                </div>
            </form>

        </div>

    </div>


    <!-- casuta de register -->
    <div class="register-text">
        <p><b>Don't have an account?</b> </p>

        <form action="http://localhost:8080/CreateAccount.jsp">
            <input type="submit" value="Register" />
        </form>
    </div>

    <div id="result" class="result">
    <pre>
        ${requestScope.loginStatus}
    </pre>
    </div>

</div>

</body>
</html>