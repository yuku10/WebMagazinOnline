<%--
  Created by IntelliJ IDEA.
  User: Alexandru Voinea
  Date: 5/28/2019
  Time: 12:28 AM
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE>
<html>
<head>
    <meta charset="UTF-8">
    <title>Magazin Online - Pagina</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>

<body>

<div class>
</div>
<br>
<form action="http://localhost:8090/Magazin/showCategories" method="post">
    <input type="submit" value="Show categories of products available"/>
</form>

<div id="result1" class="result">
    <pre>
        ${requestScope.categories}
    </pre>
</div>

<div>
    <div class >

        <form action="http://localhost:8090/Magazin/showNames" method="POST">
            <input type="submit" value="Show the names of quizzes"/>
        </form>

        <div id="result2" class="result">
            <pre>
                ${requestScope.names}
            </pre>
        </div>

        <form action="http://localhost:8090/Magazin/showDescriptions" method="post">
            <input type="submit" value="Show the description of quizzes"/>
        </form>

        <div id="result3" class="result">
            <pre>
                ${requestScope.descriptions}
            </pre>
        </div>

    </div>


</div>




</body>

</html>
